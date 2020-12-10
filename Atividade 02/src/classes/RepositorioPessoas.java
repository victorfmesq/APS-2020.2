package classes;

import java.util.HashMap;
import java.util.Map;

public class RepositorioPessoas {

        static Map<String, Pessoa> pessoas = new HashMap<>();

        public static void adicionaPessoa(String mat, Pessoa valor){
                pessoas.put(mat, valor);
        }

        public static void removerPessoa(String mat){
                pessoas.remove(mat);
        }

        public static Pessoa retornarPessoa(String mat){
                return pessoas.get(mat);
        }


}
