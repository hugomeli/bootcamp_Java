package entities;

public class ConvidadoStandard extends Convidado {

    public ConvidadoStandard(String nome) {
        this.nome = nome;
    }

    @Override
    public void degustar() {
        System.out.println(this.getNome() + " convidado standard está degustando.");
    }
}
