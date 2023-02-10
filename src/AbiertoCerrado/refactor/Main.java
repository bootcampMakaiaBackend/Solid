package AbiertoCerrado.refactor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Homero homero = new Homero("mateo",2);
        Bar bar = new Bar("bar", 1);
        Lisa lisa = new Lisa("lisa", 3);
        Pintor pintor = new Pintor();
        //se agrega a una lista de caricaturas
        List<Caricatura> caricaturas = new ArrayList<>();
        caricaturas.add(homero);
        caricaturas.add(bar);
        caricaturas.add(lisa);
        // se pinta las caricaturas
        pintor.dibujar(caricaturas);
    }
}
