package org.mendoza.reyes.yuren.pixup.repository.jdbc.impl;

import org.mendoza.reyes.yuren.pixup.model.Domicilio;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Conexion;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Domiciliojdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Domiciliojdbcimpl extends Conexion<Domicilio> implements Domiciliojdbc
{
    private static Domiciliojdbc domiciliojdbc;

    private Domiciliojdbcimpl()
    {
    }

    public static Domiciliojdbc getInstance( )
    {
        if( domiciliojdbc == null )
        {
            domiciliojdbc = new Domiciliojdbcimpl();
        }
        return domiciliojdbc;
    }

    @Override
    public List<Domicilio> findAll()
    {
        Statement statement = null;
        ResultSet resultSet = null;
        List<Domicilio>domicilios = null;
        Domicilio domicilio = null;
        String query = "SELECT * FROM TBL_DOMICILIO";

        try
        {
            if( openConnection( ) )
            {
                System.out.println("Error en conexión");
                return null;
            }
            statement = connection.createStatement( );
            resultSet = statement.executeQuery( query );
            domicilios = new ArrayList<>( );
            while( resultSet.next() )
            {
                domicilio = new Domicilio();
                domicilio.setId(resultSet.getInt(1));
                domicilio.setCalle(resultSet.getString(2));
                domicilio.setNum_exterior(resultSet.getInt(3));
                domicilio.setNum_interior(resultSet.getInt(4));
                domicilio.setId_colonia(resultSet.getInt(5));
                domicilio.setId_tipo_domicilio(resultSet.getInt(6));
                domicilio.setId_usuario(resultSet.getInt(7));
                domicilios.add( domicilio );
            }
            resultSet.close();
            statement.close();
            closeConnection( );
            return domicilios;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main( String a[] )
    {
        Domiciliojdbcimpl
                .getInstance()
                .findAll()
                .stream()
                .forEach( System.out::println);
    }
}
