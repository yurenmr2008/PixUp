package org.mendoza.reyes.yuren.pixup.repository.jdbc;

import org.mendoza.reyes.yuren.pixup.model.Estado;

import java.util.List;

public interface Estadojdbc
{
    List<Estado> findAll( );
<<<<<<< HEAD
    Estado findByIde(Integer estado);
    boolean save(Estado estado);
    boolean update(Estado estado);
    boolean delete(Estado estado);
=======
>>>>>>> 217e42f954ccdfe5ef658b3b9c566936d4fb4c92
}
