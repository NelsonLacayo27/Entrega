package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarDetallesYBeneficios() {
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
            if (empleado instanceof Beneficios) {
                System.out.println("Vacaciones: " + ((Beneficios) empleado).calcularVacaciones() + " días");
            }
            System.out.println("Salario: $" + empleado.calcularSalario());
            System.out.println();
        }
    }
}

