package com.company;

public class Produto
{
    private int cod_produto;
    private String desc_produto;
    private double valor;
    private double custo;
    private double margem_lucro;
    private int qtd_stoque;

    public Produto(int cod_produto, String desc_produto){
        this.cod_produto = cod_produto;
        this.desc_produto = desc_produto;
    }

    public Produto(int cod_produto, String desc_produto, double valor, double custo, double margem_lucro) {
        this.cod_produto = cod_produto;
        this.desc_produto = desc_produto;
        this.valor = valor;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
    }

    public Produto(int cod_produto, String desc_produto, double valor, double custo, double margem_lucro, int qtd_stoque) {
        this.cod_produto = cod_produto;
        this.desc_produto = desc_produto;
        this.valor = valor;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
        this.qtd_stoque = qtd_stoque;
    }

    // methods

    public void compra(int qtd){
        this.qtd_stoque += qtd;
    }

    public void venda(int qtd){
        this.qtd_stoque -= qtd;
    }

    public double calculaPrecoVenda(){
        return this.valor + this.custo + this.margem_lucro * (this.valor + this.custo);
    }

    // getters and Setters
    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getDesc_produto() {
        return desc_produto;
    }

    public void setDesc_produto(String desc_produto) {
        this.desc_produto = desc_produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargem_lucro() {
        return margem_lucro;
    }

    public void setMargem_lucro(double margem_lucro) {
        this.margem_lucro = margem_lucro;
    }

    public int getQtd_stoque() {
        return qtd_stoque;
    }

    public void setQtd_stoque(int qtd_stoque) {
        this.qtd_stoque = qtd_stoque;
    }

}

