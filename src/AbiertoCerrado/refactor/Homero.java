package AbiertoCerrado.refactor;

public class Homero extends Caricatura{


    public Homero(String nombre, int edada) {
        super(nombre, edada);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Homero");
    }
}
