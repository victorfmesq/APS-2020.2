package classes;

public abstract class Filme extends Produto
{
    int anoLancamento;
    int duracao; // em minutos

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "anoLancamento=" + anoLancamento +
                ", duracao=" + duracao +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", locado=" + locado +
                '}';
    }
}
