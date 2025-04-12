package org.mendoza.reyes.yuren.pixup.repository.jdbc.impl;


import org.mendoza.reyes.yuren.pixup.model.Usuario;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Conexion;

import org.mendoza.reyes.yuren.pixup.repository.jdbc.Usuariojdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Usuariojdbcimpl extends Conexion<Usuario> implements Usuariojdbc
{
    private static Usuariojdbc usuariojdbc;

    private Usuariojdbcimpl()
    {
    }

    public static Usuariojdbc getInstance( )
    {
        if( usuariojdbc == null )
        {
            usuariojdbc = new Usuariojdbcimpl();
        }
        return usuariojdbc;
    }

    @Override
    public List<Usuario> findAll()
    {
        Statement statement = null;
        ResultSet resultSet = null;
        List<Usuario>usuarios = null;
        Usuario usuario = null;
        String query = "SELECT * FROM TBL_USUARIO";

        try
        {
            if( openConnection( ) )
            {
                System.out.println("Error en conexión");
                return null;
            }
            statement = connection.createStatement( );
            resultSet = statement.executeQuery( query );
            usuarios = new ArrayList<>( );
            while( resultSet.next() )
            {
                usuario = new Usuario();
                usuario.setId(resultSet.getInt(1));
                usuario.setNombre(resultSet.getString(2));
                usuario.setPrimer_apellido(resultSet.getString(3));
                usuario.setSegundo_apellido(resultSet.getString(4));
                usuario.setPassword(resultSet.getString(5));
                usuario.setEmail(resultSet.getString(6));
                usuarios.add( usuario );
            }
            resultSet.close();
            statement.close();
            closeConnection( );
            return usuarios;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main( String a[] )
    {
        Usuariojdbcimpl
                .getInstance()
                .findAll()
                .stream()
                .forEach( System.out::println);
    }
}
