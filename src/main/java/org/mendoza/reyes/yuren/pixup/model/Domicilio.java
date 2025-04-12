package org.mendoza.reyes.yuren.pixup.model;

public class Domicilio extends Catalogo
{
    private String calle;
    private int num_exterior;
    private int num_interior;
    private int id_colonia;
    private int id_tipo_domicilio;
    private int id_usuario;

    public Domicilio() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum_exterior() {
        return num_exterior;
    }

    public void setNum_exterior(int num_exterior) {
        this.num_exterior = num_exterior;
    }

    public int getNum_interior() {
        return num_interior;
    }

    public void setNum_interior(int num_interior) {
        this.num_interior = num_interior;
    }

    public int getId_colonia() {
        return id_colonia;
    }

    public void setId_colonia(int id_colonia) {
        this.id_colonia = id_colonia;
    }

    public int getId_tipo_domicilio() {
        return id_tipo_domicilio;
    }

    public void setId_tipo_domicilio(int id_tipo_domicilio) {
        this.id_tipo_domicilio = id_tipo_domicilio;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    @Override
    public String toString()
    {
        return "Domicilio{" +
                "Calle='" + calle + '\'' + ", numero exterior: " + num_exterior + ", numero interior "+ num_interior +
                ", id_colonia: " + id_colonia + ", id_tipo de domicilio: " + id_tipo_domicilio +
                ", id_usuario" + id_usuario +
                ", id=" + id +
                '}';
    }
}
