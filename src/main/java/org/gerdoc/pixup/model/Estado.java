package org.gerdoc.pixup.model;

import org.gerdoc.pixup.util.ReadUtil;

public class Estado {
    private Integer ide;
    private String nombre;

    public Estado() {
    }

    public Estado(Integer ide, String nombre) {
        this.ide = ide;
        this.nombre = nombre;
    }

    public Integer getIde() {
        return ide;
    }

    public void setIde(Integer ide) {
        this.ide = ide;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}