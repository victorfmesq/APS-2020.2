package classes;

public class Vhs extends Filme
{
    private boolean cores;

    public Vhs(String cod, String tit, String gen, int anoL, int dur, boolean cores) {
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.anoLancamento = anoL;
        super.duracao = dur;
        this.cores = cores;
    }

    public Vhs(String cod, String tit, String gen, boolean loc ,int anoL, int dur, boolean cores) {
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = loc;
        super.anoLancamento = anoL;
        super.duracao = dur;
        this.cores = cores;
    }

    public boolean isCores() {
        return cores;
    }

    public void setCores(boolean cores) {
        this.cores = cores;
    }

    @Override
    double calcularDiaria(int c) {
        if(this.cores){
            return c * 15.0;
        }
        return c * 8.0;
    }

    @Override
    public String toString() {
        return "Vhs{" +
                "anoLancamento=" + anoLancamento +
                ", duracao=" + duracao +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", locado=" + locado +
                ", cores=" + cores +
                '}';
    }
}
