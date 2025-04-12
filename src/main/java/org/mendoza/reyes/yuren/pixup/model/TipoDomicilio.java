package org.mendoza.reyes.yuren.pixup.model;

public class TipoDomicilio extends Catalogo
{
    private String descripcion;

    public TipoDomicilio() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString()
    {
        return "Tipo de domicilio{" +
                "Descripcion='" + descripcion + '\'' +
                ", id=" + id +
                '}';
    }
}
