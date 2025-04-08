package org.mendoza.reyes.yuren.pixup.repository.jdbc.impl;


import org.mendoza.reyes.yuren.pixup.model.Municipio;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Conexion;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Municipiojdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Municipiojdbcimpl  extends Conexion<Municipio> implements Municipiojdbc
{

    private static Municipiojdbc municipiojdbc;

    private Municipiojdbcimpl()
    {
    }

    public static Municipiojdbc getInstance( )
    {
        if( municipiojdbc == null )
        {
            municipiojdbc = new Municipiojdbcimpl();
        }
        return municipiojdbc;
    }

    @Override
    public List<Municipio> findAll()
    {
        Statement statement = null;
        ResultSet resultSet = null;
        List<Municipio>municipios = null;
        Municipio municipio = null;
        String query = "SELECT * FROM TBL_MUNICIPIO";

        try
        {
            if( openConnection( ) )
            {
                System.out.println("Error en conexión");
                return null;
            }
            statement = connection.createStatement( );
            resultSet = statement.executeQuery( query );
            municipios = new ArrayList<>( );
            while( resultSet.next() )
            {
                municipio = new Municipio();
                municipio.setId( resultSet.getInt( 1 ) );
                municipio.setNombre( resultSet.getString( 2 ) );
                municipio.setId_estado(resultSet.getInt(3));
                municipios.add( municipio );
            }
            resultSet.close();
            statement.close();
            closeConnection( );
            return municipios;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main( String a[] )
    {
        Municipiojdbcimpl
                .getInstance()
                .findAll()
                .stream()
                .forEach( System.out::println);
    }
}
