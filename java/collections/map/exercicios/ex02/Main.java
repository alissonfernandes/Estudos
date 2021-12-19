import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        // Ordem aleatória
        System.out.println("Ordem aleatória");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Joana", 123456789));
            put(3, new Contato("Caria", 000123002));
            put(2, new Contato("Pedroca", 789456789));
        }};
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());
            
        // Ordem de inserção
        System.out.println("\nOrdem de inserção");
        Map<Integer, Contato> agenda2 = new LinkedHashMap<>(){{
            put(1, new Contato("Joana", 123456789));
            put(3, new Contato("Caria", 000123002));
            put(2, new Contato("Pedroca", 789456789));
        }};
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());

        // Ordem id
        System.out.println("\nOrdem por id");
        Map<Integer, Contato> agenda3 = new TreeMap<>(agenda2);
        for (Map.Entry<Integer, Contato> entry : agenda3.entrySet()) System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());
        
        // Ordem número de telefona
        System.out.println("\nOrdem número de telefone");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorNumero());
        set.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());
            
        

    }
}