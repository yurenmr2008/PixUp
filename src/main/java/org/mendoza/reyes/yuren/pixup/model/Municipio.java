package org.mendoza.reyes.yuren.pixup.model;

public class Municipio extends Catalogo
{
    private String nombre;
    private int id_estado;

    public Municipio() {
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    @Override
    public String toString()
    {
        return "Municipio{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id + ", id_estado="+ id_estado +
                '}';
    }
}
