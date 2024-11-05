
public class Auto extends vehiculo {

    private int puertas;


    public Auto(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año);
        this.puertas = puertas;
    }


    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.printf("Número de puertas: %d%n", puertas);
    }
}

