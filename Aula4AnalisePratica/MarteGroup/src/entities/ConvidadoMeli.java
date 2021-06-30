package entities;

public class ConvidadoMeli extends Convidado {

    public ConvidadoMeli(String nome){
        this.nome = nome;
    }


    @Override
    public void degustar() {
        System.out.println(this.getNome() + " convidado Meli desgutou. Viva la Chiqui !!");
    }
}
