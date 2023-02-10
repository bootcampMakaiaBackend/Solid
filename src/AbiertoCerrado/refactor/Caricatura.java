package AbiertoCerrado.refactor;

public abstract class Caricatura {
    private String nombre;
    private int edad;

    public Caricatura(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void dibujar();
}
