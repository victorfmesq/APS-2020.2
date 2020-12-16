package classes;

public class Gerente extends Funcionario{

    public Gerente(String nome, String matricula, String login, String senha) {
        super.nome = nome;
        super.matricula = matricula;
        super.login = login;
        super.senha = senha;
        super.isCliente = false;
        super.isGerente = true;
    }

    public void adicionarCliente(String mat, Cliente c){
        RepositorioPessoas.adicionaPessoa(mat, c);
    }

    public void adicionarProduto(String cod, Produto p){
        if(RepositorioProdutos.retornarProduto(cod) != null){
            System.out.println("ERRO: Codigo ja registrado");
            return;
        }
        RepositorioProdutos.adicionaProduto(cod, p);
    }

    public void adicionarOperador(String mat, Operador o){
        RepositorioPessoas.adicionaPessoa(mat, o);
    }

    public void listarClientes(){
        for(Pessoa pessoa : RepositorioPessoas.pessoas.values()){
            if(pessoa.isCliente){
                System.out.println(pessoa.toString());
            }
        }
    }

    public void listarProdutos(){
        for(Produto produto : RepositorioProdutos.produtos.values()){
            System.out.println(produto.toString());
        }
    }

    public void listarOperadores(){
        for(Pessoa pessoa : RepositorioPessoas.pessoas.values()){
            if(!pessoa.isCliente && !pessoa.isGerente){
                System.out.println(pessoa.toString());
            }
        }
    }

    public void procurarClientes(String matricula){
        if(RepositorioPessoas.retornarPessoa(matricula) != null && RepositorioPessoas.retornarPessoa(matricula).isCliente){
            System.out.println(RepositorioPessoas.pessoas.get(matricula).toString());
            return;
        }
        System.out.println("ERRO: Matricula não encontrada");
    }

    public void prourarProdutos(String codigo){
        if(RepositorioProdutos.retornarProduto(codigo) != null){
            System.out.println(RepositorioProdutos.produtos.get(codigo).toString());
        }
       System.out.println("ERRO: Produto nao encontrado");
    }

    public void procurarOperadores(String matricula){
        if(RepositorioPessoas.retornarPessoa(matricula) != null && !RepositorioPessoas.retornarPessoa(matricula).isCliente){
            System.out.println(RepositorioPessoas.pessoas.get(matricula).toString());
            return;
        }
        System.out.println("ERRO: Matricula não encontrada");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }


}
