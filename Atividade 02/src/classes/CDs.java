package classes;

public class CDs extends Musica{

    boolean arranhado;
    boolean duplo;

    public CDs(String cod, String tit, String gen, boolean loc,String aut, int nf, boolean arranhado, boolean duplo) {
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = loc;
        super.autor = aut;
        super.numFaixa = nf;
        this.arranhado = arranhado;
        this.duplo = duplo;
    }

    public CDs(String cod, String tit, String gen, String aut, int nf, boolean arranhado, boolean duplo) {
        super.codigo = cod;
        super.titulo = tit;
        super.genero = gen;
        super.locado = false;
        super.autor = aut;
        super.numFaixa = nf;
        this.arranhado = arranhado;
        this.duplo = duplo;
    }

    public boolean isArranhado() {
        return arranhado;
    }

    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }

    public boolean isDuplo() {
        return duplo;
    }

    public void setDuplo(boolean duplo) {
        this.duplo = duplo;
    }

    @Override
    double calcularDiaria(int c) {
        if(this.arranhado && this.duplo){ return c * 12.0;}
        else if(this.arranhado && !this.duplo){ return c * 6;}
        else if(!this.arranhado && this.duplo){ return c * 20.0; }
        else{return c * 10.0;}
    }

    @Override
    public String toString() {
        return "CDs{" +
                "duplo=" + duplo +
                ", autor='" + autor + '\'' +
                ", numFaixa=" + numFaixa +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", locado=" + locado +
                '}';
    }
}
