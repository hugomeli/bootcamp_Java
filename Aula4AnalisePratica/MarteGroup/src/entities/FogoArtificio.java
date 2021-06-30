package entities;

public abstract class FogoArtificio implements FogoArti{

    protected String barulho;

    public FogoArtificio(String barulho){
        this.barulho = barulho;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    public void estourar() {
        System.out.println(this.getBarulho());
    }
}
