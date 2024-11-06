package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Departamento departamentoIT = new Departamento("IT", "Edificio A");
            Departamento departamentoHR = new Departamento("Recursos Humanos", "Edificio B");

            Empleado empleado1 = new EmpleadoPermanente("Carlos", 30, departamentoIT);
            Empleado empleado2 = new EmpleadoContratado("Ana", 25, departamentoHR);

            Empresa empresa = new Empresa();
            empresa.agregarEmpleado(empleado1);
            empresa.agregarEmpleado(empleado2);

            empresa.mostrarDetallesYBeneficios();
        }
    }



