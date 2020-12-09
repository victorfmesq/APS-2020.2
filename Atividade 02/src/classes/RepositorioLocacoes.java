package classes;

import java.util.ArrayList;

public class RepositorioLocacoes {

    ArrayList<Locacoes> locacoes = new ArrayList();

    public void AdicionarLocacao(Locacoes loc){ // passa o objeto
        locacoes.add(loc);
    }

    public void removerLocacao(Locacoes loc){ // passa o objeto
        locacoes.remove(loc);
    }

    public Locacoes retornarLocacao(String cod){ // passa uma stirng com codigo do produto
        for(int i = 0; i < locacoes.size(); i++){
            if(locacoes.get(i).getCodigoProduto() == cod){
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
