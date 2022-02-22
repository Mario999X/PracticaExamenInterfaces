package com.example.practicaexamen;

public class Animal {

    private String nombre;
    private int edad;
    private String clasificacion;


    @Override
    public String toString() {
        return nombre;
    }

    public Animal(String nombre, int edad, String clasificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
