package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class RepositorioLocacoes {

    static ArrayList<Locacoes> locacoes = new ArrayList();
    static Scanner scan = new Scanner(System.in);

    public static void AdicionarLocacao(String cod, String mat){ // passa o objeto
        System.out.println("Digite a data de entrega do produto");
        Calendar dataEntrega = GregorianCalendar.getInstance();
        dataEntrega.getTime();
        int diasLoc = scan.nextInt();
        // na linha abaixo pegamos a data atual e somamos os dias do ano com a quantidade de dias que o produto será alugado
        dataEntrega.set(Calendar.DAY_OF_YEAR, dataEntrega.get(Calendar.DAY_OF_YEAR) + diasLoc);
        Locacoes loc = new Locacoes(cod, mat, dataEntrega);
        locacoes.add(loc);
        System.out.println("Locação feita com sucesso");
    }

    public static void removerLocacao(String cod, String mat){ // passa o objeto
        for(int i = 0; i < locacoes.size(); i++){
            if(locacoes.get(i).getCodigoProduto().equals(cod) && locacoes.get(i).getMatriculaCliente().equals(mat)){
                locacoes.remove(i);
                System.out.println("Locação removia com sucesso!");
                return;
            }
        }
        System.out.println("Produto com codigo " + cod + "nao foi ou não esta locado por Cliente de matricula " + mat);
        System.out.println("Por favor, verifique os dados e tente novamente");
    }

    public static Locacoes retornarLocacao(String cod){ // passa uma stirng com codigo do produto
        for(int i = 0; i < locacoes.size(); i++){
            if(locacoes.get(i).getCodigoProduto().equals(cod)){
                return locacoes.get(i);
            }
        }
        System.out.println("ERRO:Produto não foi locado");
        return null;
    }
    
    public ArrayList<Locacoes> getLocacoes() {
        return locacoes;
    }
}
