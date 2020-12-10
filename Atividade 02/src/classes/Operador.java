package classes;

public class Operador extends Funcionario{

    public Operador(String nome, String matricula, String login, String senha) {
        super.nome = nome;
        super.matricula = matricula;
        super.isCliente = false;
        super.login = login;
        super.senha = senha;
    }

    void locarProduto(String codigo, String matricula){
        RepositorioLocacoes loc = new RepositorioLocacoes();
        loc.AdicionarLocacao(codigo, matricula);
    }

    void excluirLocacao(String codigo, String matricula){
        RepositorioLocacoes loc = new RepositorioLocacoes();
        loc.removerLocacao(codigo, matricula);
    }

    void fazerBaixa(String codigo, String matricula){
        RepositorioLocacoes loc = new RepositorioLocacoes();
        for(int i = 0; i < loc.getLocacoes().size(); i++){
            if(loc.getLocacoes().get(i).getCodigoProduto().equals(codigo) &&
               loc.getLocacoes().get(i).getMatriculaCliente().equals(matricula)){
                int diaria = loc.getLocacoes().get(i).getDiarias();
                double valorDiarias = RepositorioProdutos.getProdutos().get(codigo).calcularDiaria(diaria);
                double multa = loc.getLocacoes().get(i).calcularMulta();

                System.out.println("O valor total eh de: " + (valorDiarias + multa) +
                        "\nSendo: \nValor das Diarias " + valorDiarias + " -> " + diaria + " diarias" +
                        "\nValor da Multa: " + multa);
                return;
            }
        }
    }

    void procurarProduto(String codigo){
        Produto p = RepositorioProdutos.retornarProduto(codigo);
        if(p == null){
            System.out.println("ERRO: Este produto nao foi cadastrado no sistema");
            return;
        }
        System.out.println(p.toString());
    }

    void procurarClientes(String matricula){
        Pessoa p = RepositorioPessoas.retornarPessoa(matricula);
        if(p == null){
            System.out.println("ERRO: Este clinte não foi cadastrado no sistema");
            return;
        }
        System.out.println(p.toString());
    }

    @Override
    public String toString() {
        return "Operador{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
