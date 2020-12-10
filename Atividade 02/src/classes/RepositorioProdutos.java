package classes;

import java.util.HashMap;
import java.util.Map;

public class RepositorioProdutos {

    static Map<String, Produto> produtos = new HashMap<>();

    // methods
    public static void adicionaProduto(String chave, Produto valor){
        produtos.put(chave, valor);
    }

    public static Produto retornarProduto(String cod) {
        return produtos.get(cod);
    }

    public static void removerProduto(String cod){
        produtos.remove(cod);
    }

    // gets and sets (listagens)
    public static Map<String, Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(Map<String, Produto> produtos) {
        RepositorioProdutos.produtos = produtos;
    }
}
