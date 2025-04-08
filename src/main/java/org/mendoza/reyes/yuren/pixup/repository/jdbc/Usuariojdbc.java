package org.mendoza.reyes.yuren.pixup.repository.jdbc;

import org.mendoza.reyes.yuren.pixup.model.Usuario;

import java.util.List;

public interface Usuariojdbc
{
    List<Usuario> findAll( );
}
