package classes;

import java.util.HashMap;
import java.util.Map;

public class RepositorioProdutos {

    static Map<String, Produto> produtos = new HashMap<String, Produto>();

    public static void adicionaProduto(String chave, Produto valor){
        produtos.put(chave, valor);
    }

    public Produto getProduto(String cod){
        return produtos.get(cod);
    }

    public static Map<String, Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(Map<String, Produto> produtos) {
        RepositorioProdutos.produtos = produtos;
    }
}
