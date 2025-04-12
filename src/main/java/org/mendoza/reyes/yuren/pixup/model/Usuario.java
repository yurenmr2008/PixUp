package org.mendoza.reyes.yuren.pixup.model;

public class Usuario extends Catalogo
{
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String password;
    private String email;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString()
    {
        return "Usuario{" +
                "Nombre='" + nombre + '\'' + ", apellidos: " + primer_apellido + " "+ segundo_apellido +
                ", password: " + password + ", email: " + email +
                ", id=" + id +
                '}';
    }
}
