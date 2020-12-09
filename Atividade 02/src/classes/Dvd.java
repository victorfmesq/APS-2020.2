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

    public Dvd(String cod, String tit, String gen, boolean loc ,int anoL, int dur, boolean arr){
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = loc;
        super.anoLancamento = anoL;
        super.duracao = dur;
        this.arranhado = arr    ;
    }

    @Override
    double calcularDiaria() {
        return 0;
    }
}
