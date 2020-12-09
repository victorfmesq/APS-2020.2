package classes;

import java.util.HashMap;
import java.util.Map;

public class RepositorioPessoas {

        static Map<String, Pessoa> pessoas = new HashMap<String, Pessoa>();

        public void adicionaPessoa(String chave, Pessoa valor){
                this.pessoas.put(chave, valor);
        }
}
