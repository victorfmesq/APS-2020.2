package com.company;

import classes.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isOn = true;

        do{
            System.out.println("**** Bem-vindo, escolha um perfil abixo e tecle ENTER: ****");
            System.out.println("1 - Gerente");
            System.out.println("2 - Operador de Sistema");
            System.out.println("3 - Sair");
            System.out.println("***********************************************************");

            int op = scan.nextInt(); // operação primaria
            switch(op){
                case 1:
                    boolean existe = true; // indica se existe ou não um cadastro
                    do{
                        // Login Gerente
                        System.out.println("**** Faça seu Login ****");
                        System.out.println("Digite seu login: ");
                        String login = scan.next();
                        System.out.println("Digite sua senha: ");
                        String senha = scan.next();


                        // testar se Login e senha são validos e se é um gerente
                        // se for valido, sair do laço e continuar com o programa
                        // se nao, emitir um Warning e voltar para tela de login

                    }while(!existe);

                    boolean operando = true; // ativo enquanto o usuário estiver usando o programa
                    do{
                        System.out.println("**** Olá Gerente <Nome do Gerente> ****"); // "ola gerente " + Gerente.getNome()
                        System.out.println("1 - Cadastrar Produto");
                        System.out.println("2 - Cadastrar Cliente");
                        System.out.println("3 - Cadastrar Operador");
                        System.out.println("4 - Listar Produtos");
                        System.out.println("5 - Listar Clientes");
                        System.out.println("6 - Listar Operadores");
                        System.out.println("7 - Procurar Produto");
                        System.out.println("8 - Procurar Cliente");
                        System.out.println("9 - Procurar Operador");
                        System.out.println("10 - Sair");
                        System.out.println("***************************************");
                        System.out.println("Digite a opção: ");
                        int gOp = scan.nextInt(); // gOp = operação do gerente

                        switch(gOp){
                            case 1:
                                // Cadastrar Produto (Alimenta a classe Produto -> use Sets())
                                break;
                            case 2:
                                // Cadastrar Cliente (Alimenta a classe Cliente -> use Sets())
                                break;
                            case 3:
                                // Cadastrar Operador (Alimenta a classe Operador -> use Sets())
                                break;
                            case 4:
                                // Listar Produtos (mostrar dados referentes ao objeto escolhido um a um -> use toString())
                                break;
                            case 5:
                                // Listar Clientes (mostrar dados referentes ao objeto escolhido um a um -> use toString())
                                break;
                            case 6:
                                // Listar Operadores (mostrar dados referentes ao objeto escolhido um a um -> use toString())
                                break;
                            case 7:
                                // Procurar Produto (Peça o código e mostre o Produto correspondente caso ele exista)
                                // -> acessar o repositorio correspondente
                                break;
                            case 8:
                                // Procurar Cliente (Peça a matricula e mostre a Pessoa correspondente caso ela exista)
                                // -> acessar o repositorio correspondente
                                break;
                            case 9:
                                // Procurar Operador (Peça a matricula e mostre a Pessoa correspondente caso ela exista)
                                // -> acessar o repositorio correspondente
                                break;
                            case 10:
                                // sair
                                System.out.println("**** Até breve ****");
                                operando = false;
                                break;
                            default:
                                System.out.println("**** Opção invalida ****");

                        }
                    }while (operando);
                    break;
                case 2:
                    // Login Operador de Sistemas
                    existe = true;
                    do{
                        // Login Operador
                        System.out.println("**** Faça seu Login ****");
                        System.out.println("Digite seu login: ");
                        String login = scan.nextLine();
                        System.out.println("Digite sua senha: ");
                        String senha = scan.nextLine();


                        // testar se Login e senha são validos e se é um operador
                        // se for valido, sair do laço e continuar com o programa
                        // se nao, emitir um Warning e voltar para tela de login

                    }while(!existe);

                    operando = true;
                    do{
                        System.out.println("**** Olá Operador <Nome do Operador> ****"); // "ola operador " + Operador.getNome()
                        System.out.println("1 - Fazer locação");
                        System.out.println("2 - Dar baixa em locação");
                        System.out.println("3 - Excluir locação");
                        System.out.println("4 - Procurar Produto");
                        System.out.println("5 - Procurar Cliente");
                        System.out.println("6 - Sair");
                        System.out.println("***************************************");
                        System.out.println("Digite a opção: ");
                        int oOp = scan.nextInt(); // oOp = operação do operador

                        switch(oOp){
                            case 1:
                                // Fazer Locação
                                /* deve pedir 2 informações:
                                    1 - matricula do Cliente
                                    2 - código do Produto

                                    se produto estiver alugado
                                        informe que não é possivel aluga-lo
                                    se não
                                        um objeto do tipo Locação será armazenado no repositório de locações contendo:
                                         - matricula do Cliente
                                         - codigo do produto
                                         - data de saída
                                         - data prevista de entrega (sendo DUAS diarias sobre a data de saida (48h))
                                 */
                                break;
                            case 2:
                                // Dar baixa em locação
                                /* deve pedir 2 informações:
                                    1 - matricula do Cliente
                                    2 - código do Produto

                                    O sistema deve: -> percorrer o Repositorio de Locações;
                                                    -> achar uma locação que tenha os dados acima (codigo e matricula);
                                                        * use EQUALS para comparar *
                                                    -> após encontrar, gerar o valor das diárias e as multas (caso a data prevista seja ultrapassada)
                                                        * Podemos escolher o valor da multa e as diárias*
                                 */
                                break;
                            case 3:
                                // Excluir locação
                                /* deve pedir 2 informações:
                                    1 - matricula do Cliente
                                    2 - código do Produto

                                    O sistema deve: -> percorrer o Repositorio de Locações;
                                                    -> achar uma locação que tenha os dados acima (codigo e matricula);
                                                        * use EQUALS para comparar *
                                                    -> após encontrar, remover do repositórios
                                 */
                                break;
                            case 4:
                                // Procurar Produto (Peça o código e mostre o Produto correspondente caso ele exista)
                                // -> acessar o repositorio correspondente
                                break;
                            case 5:
                                // Procurar Cliente (Peça a matricula e mostre a Pessoa correspondente caso ela exista)
                                // -> acessar o repositorio correspondente
                                break;
                            case 6:
                                // Sair
                                System.out.println("**** Até breve ****");
                                operando = false;
                                break;
                            default:
                                System.out.println("**** Opção invalida ****");
                        }
                    }while (operando);
                    break;
                case 3:
                    // sair
                    System.out.println("**** Até breve ****");
                    isOn = false;
                    break;
            }

        }while(isOn);
    }
}
