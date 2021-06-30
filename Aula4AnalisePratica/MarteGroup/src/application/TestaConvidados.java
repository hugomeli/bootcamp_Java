package application;

import entities.Convidado;
import entities.ConvidadoMeli;
import entities.ConvidadoStandard;

public class TestaConvidados {

    public static void main(String[] args) {

        Convidado cnv1 = new ConvidadoMeli("Hugo");
        cnv1.degustar();

        Convidado cnv2 = new ConvidadoStandard("Joana");
        cnv2.degustar();
    }
}
