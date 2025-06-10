package org.mendoza.reyes.yuren.pixup.gui.consola;

import org.junit.jupiter.api.Test;
import org.mendoza.reyes.yuren.pixup.model.Estado;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EstadoCatalogoTest {

    @Test
    void getInstance()
    {
    }

    @Test
    void newT() {
    }

    @Test
    void processNewT() {
    }

    @Test
    void processEditT() {
    }

    @Test
    void processList()
    {
        EstadoCatalogo estadoCatalogo = EstadoCatalogo.getInstance();
        List<Estado> estados =  estadoCatalogo.processList( );
        estados.forEach(System.out::println);
    }
    @Test
    void procesaOpcion( )
    {
        EstadoCatalogo estadoCatalogo = EstadoCatalogo.getInstance();
        estadoCatalogo.setOpcion( 4 );
        estadoCatalogo.procesaOpcion( );
    }


}