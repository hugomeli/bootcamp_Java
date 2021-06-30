package entities;

import java.util.List;

public class Festa {
    List<FogoArti> todosFogos;
    List<Convidado> todosConvidados;

    public Festa(List<FogoArti> todosFogos, List<Convidado> todosConvidados){
        this.todosFogos = todosFogos;
        this.todosConvidados = todosConvidados;
    }
    public void apagaVelas(){
        explodeTodosFogos();
        distribuiBolo();
    }

    public void explodeTodosFogos(){
        System.out.println("----ATENCAO: Iniciaremos a queima de fogos! ----");
        for (FogoArti fogoArtificio:
             todosFogos) {
            fogoArtificio.estourar();
        }
        System.out.println("----Queima de fogos encerrada----");
    }

    public void distribuiBolo(){
        System.out.println("-----Comecaremos a distribuir o bolo-----");
        for (Convidado convidado: todosConvidados){
            convidado.degustar();
        }
    }
}
