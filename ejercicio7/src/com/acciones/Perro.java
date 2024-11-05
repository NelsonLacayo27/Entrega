package com.acciones;

// Clase Perro implementando la interfaz Acciones
public class Perro implements Acciones {

    @Override
    public void caminar() {
        System.out.println("El perro está caminando rápidamente.");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo croquetas.");
    }
}
