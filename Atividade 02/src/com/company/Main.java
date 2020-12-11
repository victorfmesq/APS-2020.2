package com.company;

import classes.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        RepositorioPessoas rPessoas = new RepositorioPessoas();
        RepositorioProdutos rProdutos = new RepositorioProdutos();
        RepositorioLocacoes rLocacoes = new RepositorioLocacoes();

        Gerente gerente = new Gerente("Diluc","542","logingerente","senhagerente");
        RepositorioPessoas.adicionaPessoa("542", gerente);

        Operador operador = new Operador("Kaeya", "245", "loginoperador", "senhaoperador");
        RepositorioPessoas.adicionaPessoa("245", operador);

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
                    boolean existe = false; // indica se existe ou não um cadastro
                    do{
                        // Login Gerente
                        System.out.println("**** Faça seu Login ****");
                        System.out.println("Digite seu login: ");
                        String login = scan.next();
                        System.out.println("Digite sua senha: ");
                        String senha = scan.next();

                        if(gerente.getLogin().equals(login) && gerente.getSenha().equals(senha)){
                            existe = true;
                        }
                        System.out.println("Login e/ou senha inválidos. Por favor tente novamente");
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
                                // Cadastrar Produto
                                boolean optFalse = false;
                                do{
                                    System.out.println("Que tipo de PRODUTO voce deseja cadastrar?");
                                    System.out.println("1 - Filmes (midia audiovisual)");
                                    System.out.println("2 - Musicas (midia auditiva)");
                                    System.out.println("------------------------------------------");
                                    int resp = scan.nextInt();

                                    if(resp == 1){
                                        // filmes
                                        optFalse = true;
                                        boolean invalid = true;
                                        do{
                                            System.out.println("Que tipo de FILME voce deseja cadastrar??");
                                            System.out.println("1 - Bluray");
                                            System.out.println("2 - DVD");
                                            System.out.println("3 - VHS");
                                            System.out.println("------------------------------------------");
                                            resp = scan.nextInt();
                                            if(resp == 1){
                                                //Bluray
                                                invalid = false;
                                                System.out.println("Digite o CODIGO do produto: ");
                                                String cod = scan.next();
                                                System.out.println("Digite o TITULO do filme: ");
                                                String tit = scan.next();
                                                System.out.println("Digite o GENERO do filme: ");
                                                String gen = scan.next();
                                                System.out.println("Digite o ANO DE LANCAMENTO do filme: ");
                                                int ano = scan.nextInt();
                                                System.out.println("Digite a DURACAO do filme: ");
                                                int dur = scan.nextInt();
                                                System.out.println("Digite em sequencia e separados por (,) os idiomas o filme");
                                                String idi = scan.next();

                                                Bluray blu = new Bluray(cod, tit, gen, ano, dur, idi); // cria um produto Blu
                                                gerente.adicionarProduto(cod, blu); // aloca na HashMap Produto
                                                System.out.println("*** Produto Cadastrado ***");
                                            }
                                            else if(resp == 2){
                                                //DVD
                                                invalid = false;
                                                System.out.println("Digite o CODIGO do produto: ");
                                                String cod = scan.next();
                                                System.out.println("Digite o TITULO do filme: ");
                                                String tit = scan.next();
                                                System.out.println("Digite o GENERO do filme: ");
                                                String gen = scan.next();
                                                System.out.println("Digite o ANO DE LANCAMENTO do filme: ");
                                                int ano = scan.nextInt();
                                                System.out.println("Digite a DURACAO do filme: ");
                                                int dur = scan.nextInt();
                                                invalid = true;
                                                do{
                                                    System.out.println("O DVD esta arranhado??");
                                                    System.out.println("1 - SIM");
                                                    System.out.println("2 - NAO");
                                                    int arr = scan.nextInt();
                                                    if(arr == 1){
                                                        Dvd dvd = new Dvd(cod, tit, gen, ano, dur, false); // cria o produto
                                                        gerente.adicionarProduto(cod, dvd); // add no repositorio
                                                        invalid = false;
                                                        System.out.println("*** Produto Cadastrado ***");
                                                    }else if(arr == 2){
                                                        Dvd dvd = new Dvd(cod, tit, gen, ano, dur, true); // cria o produto
                                                        gerente.adicionarProduto(cod, dvd); // add no repositorio
                                                        invalid = false;
                                                        System.out.println("*** Produto Cadastrado ***");
                                                    }
                                                    else
                                                        System.out.println("ERRO: Opcao invalida, tente novamente:");
                                                }while(invalid);
                                            }
                                            else if(resp == 3){
                                                //VHS
                                                System.out.println("Digite o CODIGO do produto: ");
                                                String cod = scan.next();
                                                System.out.println("Digite o TITULO do filme: ");
                                                String tit = scan.next();
                                                System.out.println("Digite o GENERO do filme: ");
                                                String gen = scan.next();
                                                System.out.println("Digite o ANO DE LANCAMENTO do filme: ");
                                                int ano = scan.nextInt();
                                                System.out.println("Digite a DURACAO do filme: ");
                                                int dur = scan.nextInt();
                                                invalid = true;
                                                do{
                                                    System.out.println("O VHS eh a cores??");
                                                    System.out.println("1 - SIM");
                                                    System.out.println("2 - NAO");
                                                    int isCollor = scan.nextInt();
                                                    if(isCollor == 1){
                                                        Vhs vhs = new Vhs(cod, tit, gen, ano, dur, true); // cria o produto
                                                        gerente.adicionarProduto(cod, vhs); // add no repositorio
                                                        invalid = false;
                                                        System.out.println("*** Produto Cadastrado ***");
                                                    }else if(isCollor == 2){
                                                        Vhs vhs = new Vhs(cod, tit, gen, ano, dur, false); // cria o produto
                                                        gerente.adicionarProduto(cod, vhs); // add no repositorio
                                                        invalid = false;
                                                        System.out.println("*** Produto Cadastrado ***");
                                                    }
                                                    else
                                                        System.out.println("ERRO: Opcao invalida, tente novamente:");
                                                }while(invalid);
                                            }
                                            else
                                                System.out.println("ERRO: Opcao invalida, tente novamente");
                                        }while (invalid);
                                    }else if(resp == 2){
                                        // musicas
                                        optFalse = true;
                                        boolean invalid = true;
                                        do {
                                            System.out.println("Que tipo de MUSICA voce deseja cadastrar??");
                                            System.out.println("1 - CDs");
                                            System.out.println("2 - LPs");
                                            System.out.println("------------------------------------------");
                                            resp = scan.nextInt();

                                            if(resp == 1){
                                                //CDs
                                                System.out.println("Digite o CODIGO do produto: ");
                                                String cod = scan.next();
                                                System.out.println("Digite o TITULO do CD: ");
                                                String tit = scan.next();
                                                System.out.println("Digite o GENERO do CD: ");
                                                String gen = scan.next();
                                                System.out.println("Digite o AUTOR: ");
                                                String auto = scan.next();
                                                System.out.println("Digite o NUMERO DE FAIXAS: ");
                                                int nf = scan.nextInt();
                                                do{
                                                    System.out.println("O CD esta ARRANHADO?");
                                                    System.out.println("1 - SIM");
                                                    System.out.println("2 - NAO");
                                                    int arr = scan.nextInt();
                                                    if(arr == 1){
                                                        do{
                                                            System.out.println("O CD eh DUPLO?");
                                                            System.out.println("1 - SIM");
                                                            System.out.println("2 - NAO");
                                                            int opt = scan.nextInt();
                                                            if(opt == 1){
                                                                CDs cd = new CDs(cod, tit, gen, auto, nf, true, true);
                                                                gerente.adicionarProduto(cod, cd);
                                                                invalid = false;
                                                                System.out.println("*** Produto Cadastrado ***");
                                                            }
                                                            else if(opt == 2){
                                                                CDs cd = new CDs(cod, tit, gen, auto, nf, true, false);
                                                                gerente.adicionarProduto(cod, cd);
                                                                invalid = false;
                                                                System.out.println("*** Produto Cadastrado ***");
                                                            }
                                                            else
                                                                System.out.println("ERRO: Opcao invalida, tente novamente");
                                                        }while (invalid);
                                                    }
                                                    else if(arr == 2){
                                                        do{
                                                            System.out.println("O CD eh DUPLO?");
                                                            System.out.println("1 - SIM");
                                                            System.out.println("2 - NAO");
                                                            int opt = scan.nextInt();
                                                            if(opt == 1){
                                                                CDs cd = new CDs(cod, tit, gen, auto, nf, false, true);
                                                                gerente.adicionarProduto(cod, cd);
                                                                invalid = false;
                                                                System.out.println("*** Produto Cadastrado ***");
                                                            }
                                                            else if(opt == 2){
                                                                CDs cd = new CDs(cod, tit, gen, auto, nf, false, false);
                                                                gerente.adicionarProduto(cod, cd);
                                                                invalid = false;
                                                                System.out.println("*** Produto Cadastrado ***");
                                                            }
                                                            else
                                                                System.out.println("ERRO: Opcao invalida, tente novamente");
                                                        }while (invalid);
                                                    }
                                                    else
                                                        System.out.println("ERRO: Opcao invalida, tente novamente");
                                                }while (invalid);
                                            }
                                            else if(resp == 2){
                                                // LPs
                                                System.out.println("Digite o CODIGO do produto: ");
                                                String cod = scan.next();
                                                System.out.println("Digite o TITULO do LP: ");
                                                String tit = scan.next();
                                                System.out.println("Digite o GENERO do LP: ");
                                                String gen = scan.next();
                                                System.out.println("Digite o AUTOR: ");
                                                String auto = scan.next();
                                                System.out.println("Digite o NUMERO DE FAIXAS: ");
                                                int nf = scan.nextInt();
                                                do{
                                                    System.out.println("Esse LP eh RARO? ");
                                                    System.out.println("1 - SIM");
                                                    System.out.println("2 - NAO");
                                                    int raro = scan.nextInt();
                                                    if(raro == 1){
                                                        LPs lp = new LPs(cod, tit, gen, auto, nf, true);
                                                        gerente.adicionarProduto(cod, lp);
                                                        invalid = false;
                                                        System.out.println("*** Produto Cadastrado ***");
                                                    }
                                                    else if(raro == 2){
                                                        LPs lp = new LPs(cod, tit, gen, auto, nf, false);
                                                        gerente.adicionarProduto(cod, lp);
                                                        invalid = false;
                                                        System.out.println("*** Produto Cadastrado ***");
                                                    }
                                                    else
                                                        System.out.println("ERRO: Opcao invalida, tente novamente");
                                                }while(invalid);
                                            }
                                            else
                                                System.out.println("ERRO: Opcao invalida, tente novamente");
                                        }while (invalid);
                                    }
                                    break;
                                }while (!optFalse);
                            case 2:
                                // Cadastrar Cliente (Alimenta a classe Cliente -> use Sets())
                                break;
                            case 3:
                                // Cadastrar Operador (Alimenta a classe Operador -> use Sets())
                                break;
                            case 4:
                                // Listar Produtos (mostrar dados referentes ao objeto escolhido um a um -> use toString())
                                System.out.println("Lista de produtos1");
                                gerente.listarProdutos();
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
                    existe = false;
                    do{
                        // Login Operador
                        System.out.println("**** Faça seu Login ****");
                        System.out.println("Digite seu login: ");
                        String login = scan.nextLine();
                        System.out.println("Digite sua senha: ");
                        String senha = scan.nextLine();

                        if(operador.getLogin().equals(login) && operador.getSenha().equals(senha)){
                            existe = true;
                        }
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
