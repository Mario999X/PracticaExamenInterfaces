package com.example.practicaexamen;

public class Animal {

    private String nombre;
    private int edad;
    private String especie;
    private double porcentaje;


    @Override
    public String toString() {
        return nombre;
    }

    public Animal(String nombre, int edad, String especie, double porcentaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
