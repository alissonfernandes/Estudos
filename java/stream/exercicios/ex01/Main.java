import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
      
        // Ordem de inserção
        System.out.println("\nOrdem de inserção");
        Map<Integer, Contato> agenda2 = new LinkedHashMap<>(){{
            put(1, new Contato("Joana", 123456789));
            put(3, new Contato("Caria", 000123002));
            put(2, new Contato("Pedroca", 789456789));
        }};
        
        // Ordem número de telefona
        System.out.println("\nOrdem número de telefone");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>(){

            @Override
            public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
            
        });
        set.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());

        // ordem número de telefone
        System.out.println("\nOrdem número de telefone 2");
        Set<Map.Entry<Integer, Contato>> setOrdNumero = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        setOrdNumero.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry : setOrdNumero) System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());
            
        

    }
}