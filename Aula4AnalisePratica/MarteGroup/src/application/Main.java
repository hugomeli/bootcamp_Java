package application;

import entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FogoArtificio fg1 = new FogoDragao();
        FogoArtificio fg2 = new FogoBarulhento();
        FogoArtificio fg3 = new FogoSerpente();

        PacoteFogos pct1 = new PacoteFogos();
        pct1.inserirNoPacote(new FogoSerpente());
        pct1.inserirNoPacote(new FogoDragao());

        PacoteFogos pct2 = new PacoteFogos();
        pct2.inserirNoPacote(new FogoBarulhento());
        pct2.inserirNoPacote(new FogoDragao());

        PacoteFogos pct3 = new PacoteFogos();
        pct3.inserirNoPacote(new FogoDragao());
        pct3.inserirNoPacote(new FogoSerpente());

        pct2.inserirNoPacote(pct3);

        List<FogoArti> todosFogos = new ArrayList<>();
        todosFogos.add(fg1);
        todosFogos.add(fg2);
        todosFogos.add(fg3);
        todosFogos.add(pct1);
        todosFogos.add(pct2);

        Convidado convidado1 = new ConvidadoMeli("Hugo");
        Convidado convidado2 = new ConvidadoStandard("Joao");
        Convidado convidado3 = new ConvidadoMeli("Henrique");
        Convidado convidado4 = new ConvidadoStandard("Amanda");

        List<Convidado> todosConvidados = new ArrayList<>();
        todosConvidados.add(convidado1);
        todosConvidados.add(convidado2);
        todosConvidados.add(convidado3);
        todosConvidados.add(convidado4);

        Festa festa1 = new Festa(todosFogos, todosConvidados);

        festa1.apagaVelas();

    }
}
