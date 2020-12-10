package classes;

public abstract class Musica extends Produto{

    String autor;
    int numFaixa;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumFaixa() {
        return numFaixa;
    }

    public void setNumFaixa(int numFaixa) {
        this.numFaixa = numFaixa;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "autor='" + autor + '\'' +
                ", numFaixa=" + numFaixa +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", locado=" + locado +
                '}';
    }
}
