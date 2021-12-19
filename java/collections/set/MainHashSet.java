import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class MainHashSet {
    public static void main(String[] args) {
        
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8d, 6.5, 9.5, 6d, 2d, 2.5));

        System.out.println("Notas:" + notas);

        System.out.println("Contém a nota 7: " + notas.contains(7d));

        System.out.println("Menor nota: " + Collections.min(notas));

        System.out.println("Maior nota: " + Collections.max(notas));

        System.out.print("Soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Média das notas: " + soma/notas.size());

        System.out.print("Remova a nota 6: ");
        notas.remove(6d);
        System.out.println(notas);

        System.out.print("Remova as notas menores do que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        } 
        System.out.println(notas);


    }
}
