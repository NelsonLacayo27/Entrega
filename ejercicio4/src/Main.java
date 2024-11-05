// Clase Main
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de Auto
        Auto auto = new Auto("Toyota", "Corolla", 2020, 4);
        System.out.println("Información del Auto:");
        auto.imprimirInformacion();

        System.out.println(); // Línea en blanco para separación

        // Crear un objeto de Moto
        Moto moto = new Moto("Honda", "CB500", 2019, false);
        System.out.println("Información de la Moto:");
        moto.imprimirInformacion();
    }
}
