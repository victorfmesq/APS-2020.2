package classes;

public abstract class Pessoa {

    String nome;
    String matricula;
    boolean isCliente;
    boolean isGerente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isCliente() {
        return isCliente;
    }

    public void setCliente(boolean cliente) {
        isCliente = cliente;
    }

    public boolean isGerente() {
        return isGerente;
    }

    public void setGerente(boolean gerente) {
        isGerente = gerente;
    }
}
