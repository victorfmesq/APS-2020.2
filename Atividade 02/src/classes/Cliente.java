package classes;

public class Cliente extends Pessoa{

    String endereco;
    int idade;
    char sexo; // M - masculino / F - feminino / O - outro

    public Cliente(String nome, String matricula, String endereco, int idade, char sexo) {
        super.nome = nome;
        super.matricula = matricula;
        super.isCliente = true;
        super.isGerente = false;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                "endereco='" + endereco + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
