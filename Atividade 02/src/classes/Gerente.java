package classes;

public class Gerente extends Funcionario{

    public Gerente(String nome, String matricula, String login, String senha) {
        super.nome = nome;
        super.matricula = matricula;
        super.login = login;
        super.senha = senha;
    }

    void adicionarCliente(){

    }

    void adicionarProduto(){

    }

    void adicionarOperador(){

    }

    void listarClientes(){

    }

    void listarProdutos(){

    }

    void listarOperadores(){

    }

    void procurarClientes(int matricula){

    }

    void prourarProdutos(int codigo){

    }

    void procurarOperadores(int matricula){

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
