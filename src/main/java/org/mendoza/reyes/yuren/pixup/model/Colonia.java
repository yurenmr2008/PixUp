package org.mendoza.reyes.yuren.pixup.model;

public class Colonia extends Catalogo
{

    private String nombre;
    private int cp;
    private int id_municipio;

    public Colonia() {
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }

    @Override
    public String toString()
    {
        return "Colonia{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id + ", cp="+ cp + ", id_municipio= " +id_municipio +
                '}';
    }
}
