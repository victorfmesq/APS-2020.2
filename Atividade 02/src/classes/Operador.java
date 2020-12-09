package classes;

public class Operador extends Funcionario{

    public Operador(String nome, String matricula, String login, String senha) {
        super.nome = nome;
        super.matricula = matricula;
        super.login = login;
        super.senha = senha;
    }

    void locarProduto(int codigo, int matricula){

    }

    void excluirLocacao(int codigo, int matricula){

    }

    void fazerBaixa(int codigo, int matricula){

    }

    void procurarProduto(int codigo){

    }

    void procurarClientes(int matricula){

    }

    @Override
    public String toString() {
        return "Operador{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
