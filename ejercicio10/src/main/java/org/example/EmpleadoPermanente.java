package org.example;

public class EmpleadoPermanente extends Empleado implements Beneficios {
    private Departamento departamento;

    public EmpleadoPermanente(String nombre, int edad, Departamento departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return 3000.0; // Ejemplo de salario fijo para empleados permanentes
    }

    @Override
    public int calcularVacaciones() {
        return 20; // Ejemplo de días de vacaciones para empleados permanentes
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Permanente: " + nombre + ", Edad: " + edad +
                ", Departamento: " + departamento.getNombre() + ", Ubicación: " + departamento.getUbicacion());
    }
}

