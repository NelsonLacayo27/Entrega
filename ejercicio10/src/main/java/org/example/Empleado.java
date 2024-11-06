package org.example;

public abstract class Empleado {
    protected String nombre;
    protected int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract double calcularSalario();
    public abstract void mostrarDetalles();
}

