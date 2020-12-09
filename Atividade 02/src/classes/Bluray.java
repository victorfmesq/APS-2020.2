package classes;

public class Bluray extends Filme{

    String idiomas;

    public Bluray(String cod, String tit, String gen, int anoL, int dur, String idi) {
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = false;
        super.anoLancamento = anoL;
        super.duracao = dur;
        this.idiomas = idi;
    }

    public Bluray(String cod, String tit, String gen, boolean loc,int anoL, int dur, String idi) {
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = loc;
        super.anoLancamento = anoL;
        super.duracao = dur;
        this.idiomas = idi;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    double calcularDiaria() {
        return 0;
    }
}
