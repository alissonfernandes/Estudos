import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main{
    
    public static void main(String[] args) {
        

        List notas= new ArrayList(); // antes do Java 5
        List<Double> notas2 = new ArrayList<Double>(); // Generics(JKD 5) - Diamond Operator
        ArrayList<Double> notas3 = new ArrayList<>();// não recomendado, pois é recomendado programar voltado para a interface e não para a implementação
        List<Double> notas4 = new ArrayList<>(Arrays.asList(1d, 2d, 5d, 5.5));
        List<Double> notas5 =  List.of(5d, 8.5, 9d, 2d); // Lista imutavel



        List<Double> notasAluno = new ArrayList<>();

        notasAluno.add(7d);
        notasAluno.add(8.2);
        notasAluno.add(5.9);
        notasAluno.add(4d);
        notasAluno.add(6.5);
        notasAluno.add(7.5);
        notasAluno.add(3d);

        System.out.println("Notas: " + notasAluno);
        System.out.println("Índice da posição nota 6.5: " + notasAluno.indexOf(6.5));

        System.out.print("Adiciona nota 7 no índice 4: ");
        notasAluno.add(4, 7d);
        System.out.println(notasAluno);

        System.out.print("Substitua a nota 3 por 5: ");
        notasAluno.set(notasAluno.indexOf(3d), 5d);
        System.out.println(notasAluno);

        System.out.println("Verifica se há nota 10: " + notasAluno.contains(10d));

        System.out.println("Exiba a última nota da lista: " + notasAluno.get(notasAluno.size()-1));

        System.out.println("Exiba a menor nota: " + Collections.min(notasAluno));

        System.out.println("Exiba a maior nota: " + Collections.max(notasAluno));

        System.out.print("Exiba a média das notas: ");
        Double soma = 0d;
        Iterator<Double> iterator = notasAluno.iterator();
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma/(notasAluno.size()));


        System.out.print("Remova as notas menores do que 7: ");
        Iterator<Double> iterator1 = notasAluno.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notasAluno);

        System.out.print("Apague toda a lista: ");
        notasAluno.clear();
        System.out.println(notasAluno);
    }

}