package org.iesfm.personas;

public abstract class Personas {
    public String Nombre;
    public String Apellidos;
    public String Dni;
    private int Edad;

    public Personas(String nombre, String apellidos, String dni, int edad) {
        Nombre = nombre;
        Apellidos = apellidos;
        Dni = dni;
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Dni='" + Dni + '\'' +
                ", Edad=" + Edad +
                '}';
    }

    public abstract void saludar();
    public abstract void despedir();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }


}
