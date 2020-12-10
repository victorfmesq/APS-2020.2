package classes;

public class Gerente extends Funcionario{

    public Gerente(String nome, String matricula, String login, String senha) {
        super.nome = nome;
        super.matricula = matricula;
        super.login = login;
        super.senha = senha;
        super.isCliente = false;
    }

    void adicionarCliente(String mat, Cliente c){
        RepositorioPessoas.adicionaPessoa(mat, c);
    }

    void adicionarProduto(String cod, Produto p){
        RepositorioProdutos.adicionaProduto(cod, p);
    }

    void adicionarOperador(String mat, Operador o){
        RepositorioPessoas.adicionaPessoa(mat, o);
    }

    void listarClientes(){
        for(Pessoa pessoa : RepositorioPessoas.pessoas.values()){
            if(pessoa.isCliente){
                pessoa.toString();
                System.out.println("");
            }
        }
    }

    void listarProdutos(){
        for(Produto produto : RepositorioProdutos.produtos.values()){
            produto.toString();
        }
    }

    void listarOperadores(){
        for(Pessoa pessoa : RepositorioPessoas.pessoas.values()){
            if(!pessoa.isCliente){
                pessoa.toString();
                System.out.println("");
            }
        }
    }

    void procurarClientes(String matricula){
        RepositorioPessoas.pessoas.get(matricula).toString();
    }

    void prourarProdutos(String codigo){
        RepositorioProdutos.produtos.get(codigo).toString();
    }

    void procurarOperadores(String matricula){
        RepositorioPessoas.pessoas.get(matricula).toString();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
