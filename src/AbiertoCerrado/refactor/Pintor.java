package AbiertoCerrado.refactor;

import java.util.List;

public class Pintor {
    public void dibujar(List<Caricatura> caricaturas) {
        for (Caricatura caricatura: caricaturas){
            caricatura.dibujar();
        }
    }
}
