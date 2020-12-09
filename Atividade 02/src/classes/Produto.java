package classes;

public abstract class Produto
{
    String codigo;
    String titulo;
    String genero;
    Boolean locado;

    abstract double calcularDiaria(int c);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getLocado() {
        return locado;
    }

    public void setLocado(Boolean locado) {
        this.locado = locado;
    }
}
