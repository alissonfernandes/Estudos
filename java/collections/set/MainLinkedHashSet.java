import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainLinkedHashSet {
    
    public static void main(String[] args) {
        
        Set<Double> notas = new LinkedHashSet<>();

        notas.add(7d);
        notas.add(5d);
        notas.add(6.5);
        notas.add(9d);
        notas.add(4d);
        notas.add(2.5);

        System.out.println("Notas: " + notas);

        System.out.print("Notas em ordem crescente: ");
        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);

        notas2.clear();

        System.out.println("Está fazio: " + notas2.isEmpty());

    }
}
