package AbiertoCerrado;

import AbiertoCerrado.refactor.Caricatura;

import java.util.List;

public class Pintor {

    public void dibujar(List<Object> caricaturas) {

        for (Object caricatura: caricaturas) {
            if(caricatura instanceof Homero) {
                System.out.println("Dibujando a Homero");
            }

            if(caricatura instanceof  Bar){
                System.out.println("Dibujando a Bar");

            }
        }

    }

}
