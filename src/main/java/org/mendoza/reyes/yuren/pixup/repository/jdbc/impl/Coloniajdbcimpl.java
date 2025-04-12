package org.mendoza.reyes.yuren.pixup.repository.jdbc.impl;

import org.mendoza.reyes.yuren.pixup.model.Colonia;

import org.mendoza.reyes.yuren.pixup.repository.jdbc.Coloniajdbc;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Conexion;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Coloniajdbcimpl extends Conexion<Colonia> implements Coloniajdbc
{
    private static Coloniajdbc coloniajdbc;

    private Coloniajdbcimpl()
    {
    }

    public static Coloniajdbc getInstance( )
    {
        if( coloniajdbc == null )
        {
            coloniajdbc = new Coloniajdbcimpl();
        }
        return coloniajdbc;
    }

    @Override
    public List<Colonia> findAll()
    {
        Statement statement = null;
        ResultSet resultSet = null;
        List<Colonia>colonias = null;
        Colonia colonia = null;
        String query = "SELECT * FROM TBL_COLONIA";

        try
        {
            if( openConnection( ) )
            {
                System.out.println("Error en conexión");
                return null;
            }
            statement = connection.createStatement( );
            resultSet = statement.executeQuery( query );
            colonias = new ArrayList<>( );
            while( resultSet.next() )
            {
                colonia = new Colonia();
                colonia.setId( resultSet.getInt( 1 ) );
                colonia.setNombre( resultSet.getString( 2 ) );
                colonia.setCp(resultSet.getInt(3));
                colonia.setId_municipio(resultSet.getInt(4));
                colonias.add( colonia );
            }
            resultSet.close();
            statement.close();
            closeConnection( );
            return colonias;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main( String a[] )
    {
        Coloniajdbcimpl
                .getInstance()
                .findAll()
                .stream()
                .forEach( System.out::println);
    }
}
