
public class vehiculo {

    private final String marca;
    private final String modelo;
    private final int año;


    public vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }


    public void imprimirInformacion() {
        System.out.printf("Marca: %s%nModelo: %s%nAño: %d%n", marca, modelo, año);
    }
}

