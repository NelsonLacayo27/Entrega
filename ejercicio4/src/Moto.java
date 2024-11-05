
public class Moto extends vehiculo {

    private boolean tieneSidecar;


    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año); // Llamar al constructor de la clase base
        this.tieneSidecar = tieneSidecar;
    }


    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.printf("¿Tiene sidecar? %s%n", tieneSidecar ? "Sí" : "No");
    }
}

