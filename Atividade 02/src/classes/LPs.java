package classes;

public class LPs extends Musica{

    boolean raro;

    public LPs(String cod, String tit, String gen, String aut, int nf, boolean raro){
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = false;
        super.autor = aut;
        super.numFaixa = nf;
        this.raro = raro;
    }

    public LPs(String cod, String tit, String gen,boolean loc ,String aut, int nf, boolean raro){
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = loc;
        super.autor = aut;
        super.numFaixa = nf;
        this.raro = raro;
    }

    public boolean isRaro() {
        return raro;
    }

    public void setRaro(boolean raro) {
        this.raro = raro;
    }

    @Override
    double calcularDiaria(int c) {
        if(this.raro){
            return c * 35.0;
        }
        return c * 23.5;
    }
}
