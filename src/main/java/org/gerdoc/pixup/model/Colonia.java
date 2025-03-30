package org.gerdoc.pixup.model;

import org.gerdoc.pixup.util.ReadUtil;
import org.gerdoc.pixup.vista.Menu;

import java.util.ArrayList;

public class Colonia{
    private  Integer id;
    private  String nombre;
    private Integer cp;
    private  Municipio municipio;

    public Colonia() {
    }

    public Colonia(Integer id, String nombre, Integer cp, Municipio municipio) {
        this.id = id;
        this.nombre = nombre;
        this.cp = cp;
        this.municipio = municipio;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

}
