package org.mendoza.reyes.yuren.pixup.repository.jdbc.impl;


import org.mendoza.reyes.yuren.pixup.model.TipoDomicilio;

import org.mendoza.reyes.yuren.pixup.repository.jdbc.Conexion;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.TipoDomiciliojdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoDomiciliojdbcimpl extends Conexion<TipoDomicilio> implements TipoDomiciliojdbc
{

    private static TipoDomiciliojdbc tipodomiciliojdbc;

    private TipoDomiciliojdbcimpl()
    {
    }

    public static TipoDomiciliojdbc getInstance( )
    {
        if( tipodomiciliojdbc == null )
        {
            tipodomiciliojdbc = new TipoDomiciliojdbcimpl();
        }
        return tipodomiciliojdbc;
    }

    @Override
    public List<TipoDomicilio> findAll()
    {
        Statement statement = null;
        ResultSet resultSet = null;
        List<TipoDomicilio>tipoDomicilios = null;
        TipoDomicilio tipoDomicilio = null;
        String query = "SELECT * FROM TBL_TIPO_DOMICILIO";

        try
        {
            if( openConnection( ) )
            {
                System.out.println("Error en conexión");
                return null;
            }
            statement = connection.createStatement( );
            resultSet = statement.executeQuery( query );
            tipoDomicilios = new ArrayList<>( );
            while( resultSet.next() )
            {
                tipoDomicilio = new TipoDomicilio();
                tipoDomicilio.setId( resultSet.getInt( 1 ) );
                tipoDomicilio.setDescripcion( resultSet.getString( 2 ) );

                tipoDomicilios.add( tipoDomicilio );
            }
            resultSet.close();
            statement.close();
            closeConnection( );
            return tipoDomicilios;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main( String a[] )
    {
        TipoDomiciliojdbcimpl
                .getInstance()
                .findAll()
                .stream()
                .forEach( System.out::println);
    }
}
