package org.mendoza.reyes.yuren.pixup.repository.jdbc.impl;

import org.junit.jupiter.api.Test;
import org.mendoza.reyes.yuren.pixup.model.Estado;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Estadojdbc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class EstadojdbcimplTest {

    @org.junit.jupiter.api.Test
    void getInstance() {
        assertNotNull (Estadojdbcimpl.getInstance());
    }

    @org.junit.jupiter.api.Test
    void findAll() {
        Estadojdbc estadojdbc = Estadojdbcimpl.getInstance();
        List<Estado> list = estadojdbc.findAll();
        assertNotNull(list);
        assertTrue(list.size()>= 1);
    }
    @Test
    void save(){
        Estado estado = new Estado();
        boolean res = false;
        Estadojdbc estadojdbc = Estadojdbcimpl.getInstance();
        estado.setNombre("CDMX");
        res = estadojdbc.update(estado);
        assertEquals(true,res);
    }

    @Test
    void update(){
        Estado estado = new Estado();
        boolean res = false;
        estado.setNombre("Ciudad de mexico");
        estado.setId(1);
        Estadojdbc estadojdbc = Estadojdbcimpl.getInstance();
        res = estadojdbc.update(estado);
        assertEquals(true,res);
    }
}