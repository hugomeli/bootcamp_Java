package entities;

public abstract class Convidado {

    protected String nome;

    public abstract void degustar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
