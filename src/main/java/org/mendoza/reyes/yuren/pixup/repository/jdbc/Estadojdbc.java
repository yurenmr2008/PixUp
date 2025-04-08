package org.mendoza.reyes.yuren.pixup.repository.jdbc;

import org.mendoza.reyes.yuren.pixup.model.Estado;

import java.util.List;

public interface Estadojdbc
{
    List<Estado> findAll( );
}
