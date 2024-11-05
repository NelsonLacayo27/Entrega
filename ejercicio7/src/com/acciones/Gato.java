package com.acciones;

// Clase Gato implementando la interfaz Acciones
public class Gato implements Acciones {

    @Override
    public void caminar() {
        System.out.println("El gato está caminando sigilosamente.");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo atún.");
    }
}
