package application;

import entities.FogoArtificio;
import entities.FogoBarulhento;
import entities.FogoDragao;
import entities.PacoteFogos;

public class TestaFogoArtificio {

    public static void main(String[] args) {
        FogoArtificio fg1 = new FogoBarulhento();
        fg1.estourar();
        FogoArtificio fg2 = new FogoDragao();
        fg2.estourar();

        PacoteFogos pacote1 = new PacoteFogos();
        pacote1.inserirNoPacote(fg1);
        pacote1.inserirNoPacote(fg2);
        pacote1.estourar();
    }
}
