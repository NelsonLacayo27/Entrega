package com.acciones;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Acciones perro = new Perro();
        Acciones gato = new Gato();

        // Probar los métodos
        perro.caminar();  // Imprime: El perro está caminando rápidamente.
        perro.comer();    // Imprime: El perro está comiendo croquetas.

        gato.caminar();   // Imprime: El gato está caminando sigilosamente.
        gato.comer();     // Imprime: El gato está comiendo atún.
    }
}
