package org.gerdoc.pixup.model;

import org.gerdoc.pixup.util.ReadUtil;
import org.gerdoc.pixup.vista.Menu;

public class Municipio{
    private  Integer ide;
    private  String nombre;
    private Municipio municipio;

    public Municipio() {

    }

    public Municipio(Integer ide, String nombre, Municipio municipio) {
        this.ide = ide;
        this.nombre = nombre;
        this.municipio = municipio;
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

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
