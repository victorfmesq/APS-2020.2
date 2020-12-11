package classes;

public class Dvd extends Filme
{
    private boolean arranhado;

    public Dvd(String cod, String tit, String gen, int anoL, int dur){
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = false;
        super.anoLancamento = anoL;
        super.duracao = dur;
        this.arranhado = false;
    }

    public Dvd(String cod, String tit, String gen,int anoL, int dur, boolean arr){
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.anoLancamento = anoL;
        super.duracao = dur;
        this.arranhado = arr;
    }

    @Override
    double calcularDiaria(int c) {
        if(this.arranhado){
            return c * 6.0;
        }
        return c * 12.0;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "arranhado=" + arranhado +
                ", anoLancamento=" + anoLancamento +
                ", duracao=" + duracao +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", locado=" + locado +
                '}';
    }
}
