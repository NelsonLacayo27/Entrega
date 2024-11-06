package org.example;

public class EmpleadoContratado extends Empleado implements Beneficios {
    private Departamento departamento;

    public EmpleadoContratado(String nombre, int edad, Departamento departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return 1500.0; // Ejemplo de salario fijo para empleados contratados
    }

    @Override
    public int calcularVacaciones() {
        return 10; // Ejemplo de días de vacaciones para empleados contratados
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Contratado: " + nombre + ", Edad: " + edad +
                ", Departamento: " + departamento.getNombre() + ", Ubicación: " + departamento.getUbicacion());
    }
}

