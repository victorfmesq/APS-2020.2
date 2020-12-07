package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RevendaComArray rev = new RevendaComArray(100);
        int op = 0;
        do{
            System.out.println("------------------MENU------------------------");
            System.out.println("~~ Digite o valor da opercao correspondete ~~ ");
            System.out.println("Criar Produto: ----------------------------- 1");
            System.out.println("Comprar Produto: ----------------------------2");
            System.out.println("Vender Produto: -----------------------------3");
            System.out.println("Consultar Preco Produto: --------------------4");
            System.out.println("Listar Preco: ------------------------------ 5");
            System.out.println("Consultar / Alterar valor compra ----------- 6");
            System.out.println("Consultar / Alterar custo ------------------ 7");
            System.out.println("Consultar / Alterar margem de lucro -------- 8");
            System.out.println("SAIR --------------------------------------- 9");

            op = scan.nextInt();

            switch (op){
                case 1:
                    //criar produto
                    System.out.println("Digite o CODIGO e sua DESCRICAO");
                    Produto p = new Produto(scan.nextInt(), scan.nextLine());
                    rev.inserirProduto(p);
                    break;
                case 2:
                    //comprar
                    System.out.println("Digite o CODIGO e a QUANTIDADE");
                    rev.comprar(scan.nextInt(), scan.nextInt());
                    break;
                case 3:
                    //vender
                    System.out.println("Digite o CODIGO e a QUANTIDADE");
                    rev.vender(scan.nextInt(), scan.nextInt());
                    break;
                case 4:
                    //consultar preço produto
                    System.out.println("Digite o CODIGO do produto");
                    rev.consultaPrecoVenda(scan.nextInt());
                    break;
                case 5:
                    //Listar produtos
                    rev.listaPrecos();
                    break;
                case 6:
                    //Consultar / alterar VALOR COMPRA
                    System.out.println("Digite 1 para CONSULTAR ou 2 para ALTERAR");
                    int choice = scan.nextInt();
                    if(choice == 1){
                        // consultar
                        Produto prod[] = rev.getProd();
                        System.out.println("Digite o CODIGO do produto");
                        int cod = scan.nextInt();
                        for(int i = 0; i < prod.length; i++){
                            if(prod[i].getCod_produto() == cod){
                                double valor = prod[i].getValor();
                                System.out.println("Valor de compra do produto e: " + valor);
                                break;
                            }
                        }
                    }
                    else if(choice == 2){
                        // alterar
                        Produto prod[] = rev.getProd();
                        System.out.println("Digite o CODIGO do produto");
                        int cod = scan.nextInt();
                        for(int i = 0; i < prod.length; i++){
                            if(prod[i].getCod_produto() == cod){
                                System.out.println("Digite o novo valor do produto");
                                double valor = scan.nextInt();
                                prod[i].setValor(valor);
                                System.out.println("Agora o novo valor de compra do produto e: " + valor);
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("ERRO: Comando invalido");
                    }
                    break;

                case 7:
                    //Consultar / alterar CUSTO
                    System.out.println("Digite 1 para CONSULTAR ou 2 para ALTERAR");
                    choice = scan.nextInt();
                    if(choice == 1){
                        // consultar
                        Produto prod[] = rev.getProd();
                        System.out.println("Digite o CODIGO do produto");
                        int cod = scan.nextInt();
                        for(int i = 0; i < prod.length; i++){
                            if(prod[i].getCod_produto() == cod){
                                double valor = prod[i].getCusto();
                                System.out.println("Custo de compra do produto e: " + valor);
                                break;
                            }
                        }
                    }
                    else if(choice == 2){
                        // alterar
                        Produto prod[] = rev.getProd();
                        System.out.println("Digite o CODIGO do produto");
                        int cod = scan.nextInt();
                        for(int i = 0; i < prod.length; i++){
                            if(prod[i].getCod_produto() == cod){
                                System.out.println("Digite o novo CUSTO do produto");
                                double valor = scan.nextInt();
                                prod[i].setCusto(valor);
                                System.out.println("Agora o novo CUSTO de compra do produto e: " + valor);
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("ERRO: Comando invalido");
                    }
                    break;
                case 8:
                    //Consultar / alterar MARGEM DE LUCRO
                    System.out.println("Digite 1 para CONSULTAR ou 2 para ALTERAR");
                    choice = scan.nextInt();
                    if(choice == 1){
                        // consultar
                        Produto prod[] = rev.getProd();
                        System.out.println("Digite o CODIGO do produto");
                        int cod = scan.nextInt();
                        for(int i = 0; i < prod.length; i++){
                            if(prod[i].getCod_produto() == cod){
                                double valor = prod[i].getMargem_lucro();
                                System.out.println("MARGEM do produto e: " + valor);
                                break;
                            }
                        }
                    }
                    else if(choice == 2){
                        // alterar
                        Produto prod[] = rev.getProd();
                        System.out.println("Digite o CODIGO do produto");
                        int cod = scan.nextInt();
                        for(int i = 0; i < prod.length; i++){
                            if(prod[i].getCod_produto() == cod){
                                System.out.println("Digite o novo CUSTO do produto");
                                double valor = scan.nextInt();
                                prod[i].setMargem_lucro(valor);
                                System.out.println("Agora a nova MARGEM DE LUCRO do produto e: " + valor);
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("ERRO: Comando invalido");
                    }
                    break;
                case 9:
                    System.out.println("Até a proxima...");
                    break;
                default:
                    System.out.println("Comando invalido, tente novamente na proxima");
            }
        }while (op != 9);
    }
}

