
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = new ArrayList<>(){{
            add(new Pessoa("João", 50, "M"));
            add(new Pessoa("Maria", 35, "F"));
            add(new Pessoa("Marcelo", 30, "M"));
            add(new Pessoa("Joana", 20, "F"));
            add(new Pessoa("Adriano", 25, "M"));
        }};

        // Mostrar lista
        System.out.println("Lista: \n" + pessoas);

        // Embaralhar dados
        Collections.shuffle(pessoas);
        System.out.println("Dados embaralhados: \n" + pessoas);

        // Uso do "compareTo" (ordem alfabética)
        Collections.sort(pessoas);
        System.out.println("Uso do compareTo (Ordem alfabética): \n" + pessoas);

        //Collections.sort(pessoas, new ComparatorIdade());
        pessoas.sort(new ComparatorIdade());
        System.out.println("Uso do compare (Ordem de idade): \n" +pessoas);


    }
}
