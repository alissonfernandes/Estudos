import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 488));
            put("Harari, Yuval Noah", new Livro("21 Liçoes Para o Século 21", 432));
        }};

        // Exiba o nome do autor e o nome do livro
        System.out.println("Exibi nome e o livro do autor");
        for (Map.Entry<String, Livro> entry : meusLivros.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        //Exiba por ordem de inserção
        System.out.println("\nExiba por ordem de inserção: ");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 488));
            put("Harari, Yuval Noah", new Livro("21 Liçoes Para o Século 21", 432)); 
        }};
        for (Map.Entry<String, Livro> entry : meusLivros2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        // Exibe por ordem alfabética autores
        System.out.println("\nExibe por ordem alfabética dos autores:");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
        for (Map.Entry<String, Livro> entry : meusLivros3.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        // Exibe por ordem alfabética nomes dos Livros
        System.out.println("\nExibe por ordem alfabética nomes dos Livros");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomeLivro());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> entry : meusLivros4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }


    }
}
