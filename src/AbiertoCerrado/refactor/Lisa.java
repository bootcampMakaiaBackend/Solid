package AbiertoCerrado.refactor;

public class Lisa extends Caricatura{


    public Lisa(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dibujar() {
        System.out.println("dibujando a lisa");
    }
}
