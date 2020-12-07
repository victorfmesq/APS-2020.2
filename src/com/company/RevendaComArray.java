package com.company;

public class RevendaComArray
{
    private Produto prod[];
    private int index = 0;

    public RevendaComArray(int qtd){
        this.prod = new Produto[qtd];
    }

    // methods

    public void inserirProduto(Produto p){
        if(this.index < this.prod.length){
            this.prod[index] = p;
            this.index++;
        }
    }

    public void comprar(int codigo, int qtd){
        for(int i = 0; i < this.prod.length; i++){
            if(prod[i].getCod_produto() == codigo){
                // produto esta registrado
                int q = prod[i].getQtd_stoque();
                q += qtd;
                this.prod[i].setQtd_stoque(q);
                return;
            }
        }
        System.out.println("ERROR: Produto não encontrado");
    }

    public void vender(int codigo, int qtd){
        for(int i = 0; i < this.index; i++){
            if(prod[i].getCod_produto() == codigo){
                // produto esta registrado
                int q = prod[i].getQtd_stoque();
                q -= qtd;
                this.prod[i].setQtd_stoque(q);
                return;
            }
        }
        System.out.println("ERROR: Produto não encontrado");
    }

    public void consultaPrecoVenda(int codigo){
        for(int i = 0; i < this.index; i++){
            if(prod[i].getCod_produto() == codigo){
                System.out.println("Valor do produto eh :" + prod[i].getValor());
                return;
            }
        }
        System.out.println("ERROR: Produto não encontrado");
    }

    public void listaPrecos(){
        for(int i = 0; i < this.index; i++){
            int cod = prod[i].getCod_produto();
            String desc = prod[i].getDesc_produto();
            double valor = prod[i].getValor();

            System.out.println(i + "\n" +
                    "Codigo: " + cod + "\n" +
                    "Descricao: " + desc + "\n" +
                    "valor: " + valor + "\n");
        }
        return;
    }

    public Produto[] getProd() {
        return prod;
    }

    public void setProd(Produto[] prod) {
        this.prod = prod;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

