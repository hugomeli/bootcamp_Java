package entities;

import java.util.ArrayList;
import java.util.List;

public class PacoteFogos implements FogoArti{

    private List<FogoArti> pacoteFogos;

    public PacoteFogos(){
        this.pacoteFogos = new ArrayList<FogoArti>();
    }

    public PacoteFogos(List<FogoArti> outroPacote){
        this.pacoteFogos = outroPacote;
    }

    public void inserirNoPacote(FogoArti fogo){
        this.pacoteFogos.add(fogo);
    }

    public void estourar(){
        System.out.println("Estourando um pacote de fogos");
        for (FogoArti fogoArtificio:
             this.pacoteFogos) {
            fogoArtificio.estourar();
        }
        System.out.println("Pacote de fogos chegou ao fim!");
    }

}
