package classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Locacoes {

    private String codigoProduto;
    private String matriculaCliente;
    private Calendar saida; // colocarei para pegar o horario atual do sistema
    private Calendar prevEntrega;
    private int diarias; // diaria guarda a diferenca de tempo em dias entre a data de locação e devolução


    public Locacoes(String codigoProduto, String matriculaCliente, Calendar prevEntrega) {
        this.codigoProduto = codigoProduto;
        this.matriculaCliente = matriculaCliente;
        this.saida = GregorianCalendar.getInstance(); // pega o horario atual
        this.prevEntrega = prevEntrega;
        this.diarias = (int) ((prevEntrega.getTimeInMillis() - saida.getTimeInMillis()) / 3600000) % 24;
    }

    public double calcularMulta(){
        Produto p = RepositorioProdutos.retornarProduto(codigoProduto);

        if(p == null){ // se o produto nao foi locado
            System.out.println("ERRO: Este produto nao foi Locado");
            return 0;
        }
        // guarda a data atual (momento da devolução);
        Calendar dataAtual = GregorianCalendar.getInstance();

        // se a data atual excede em 1 hora a data de previsão de entrega entao multe
        if(this.prevEntrega.before(dataAtual)){
            long time1 = prevEntrega.getTimeInMillis();
            long time2 = dataAtual.getTimeInMillis();

            // conversao da diferenca do tempo de ms -> dias
            int deltaTime = (int) (((time2 - time1) / 3600000) % 24);

            //valor da multa = 10% da diaria para cada dia de atraso
            double multa = (10.0/100.0 * p.calcularDiaria(this.diarias) * deltaTime);
            System.out.println("A multa é de: " + multa);
            return multa;
        }
        System.out.println("Nenhuma multa será aplicada");
        return 0;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getMatriculaCliente() {
        return matriculaCliente;
    }

    public void setMatriculaCliente(String matriculaCliente) {
        this.matriculaCliente = matriculaCliente;
    }

    public Calendar getSaida() {
        return saida;
    }

    public void setSaida(Calendar saida) {
        this.saida = saida;
    }

    public Calendar getPrevEntrega() {
        return prevEntrega;
    }

    public void setPrevEntrega(Calendar prevEntrega) {
        this.prevEntrega = prevEntrega;
    }

    public int getDiarias() { return diarias;  }

    public void setDiarias(int diarias) { this.diarias = diarias; }
}
