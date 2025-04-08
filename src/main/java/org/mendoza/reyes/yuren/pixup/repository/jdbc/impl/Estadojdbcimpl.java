package org.mendoza.reyes.yuren.pixup.repository.jdbc.impl;

import org.mendoza.reyes.yuren.pixup.model.Estado;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Conexion;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Estadojdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Estadojdbcimpl extends Conexion<Estado> implements Estadojdbc {
    private static Estadojdbc estadoJdbc;

    private Estadojdbcimpl()
    {
    }

    public static Estadojdbc getInstance( )
    {
        if( estadoJdbc == null )
        {
            estadoJdbc = new Estadojdbcimpl( );
        }
        return estadoJdbc;
    }

    @Override
    public List<Estado> findAll()
    {
        Statement statement = null;
        ResultSet resultSet = null;
        List<Estado>estados = null;
        Estado estado = null;
        String query = "SELECT * FROM TBL_ESTADO";

        try
        {
            if( openConnection() )
            {
                System.out.println("Error en conexión");
                return null;
            }
            statement = connection.createStatement( );
            resultSet = statement.executeQuery( query );
            estados = new ArrayList<>( );
            while( resultSet.next() )
            {
                estado = new Estado();
                estado.setId( resultSet.getInt( 1 ) );
                estado.setNombre( resultSet.getString( 2 ) );
                estados.add( estado );
            }
            resultSet.close();
            statement.close();
            closeConnection( );
            return estados;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main( String a[] )
    {
        Estadojdbcimpl
                .getInstance()
                .findAll()
                .stream()
                .forEach( System.out::println);
    }

}
