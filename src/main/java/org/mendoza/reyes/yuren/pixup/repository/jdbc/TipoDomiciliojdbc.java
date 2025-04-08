package org.mendoza.reyes.yuren.pixup.repository.jdbc;

import org.mendoza.reyes.yuren.pixup.model.TipoDomicilio;

import java.util.List;

public interface TipoDomiciliojdbc
{
    List<TipoDomicilio> findAll( );
}
