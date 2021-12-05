
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
        Queue<Carro> queueCarros = new LinkedList();

        // Adicionar elementos
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
       
        // Adiciona elemento e retorna "true" caso obtenha êxito ou retona erro
        System.out.println(queueCarros.add(new Carro("Marca X")));
        System.out.println(queueCarros);

        // Adiciona elemento e retorna "true" ou "false" se obtever êxito, porem não retorna erro
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        // Retorna o primeiro elemento da fila
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        // Retorna e remove o primeiro elemento da fila
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        // Verifica se a fila esta vazia
        System.out.println(queueCarros.isEmpty());

        // Mostra o tamanho da fila
        System.out.println(queueCarros.size());

    }
}
