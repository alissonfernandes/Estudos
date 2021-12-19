import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "5","6");
        
        // Mostra todos elementos da lista
        numeros.stream().forEach(System.out::print);

        // Mostra os 5 primeiros números
        System.out.println("\nMostra 5 primeiros números:");
        numeros.stream().limit(5).collect(Collectors.toList()).forEach(System.out::print);

        // Transforme lista em lista de números inteiros
        System.out.println("\nTransfome a lista 'String' para lista 'Integer'");
        List<Integer> listInteger = numeros.stream().map(Integer::parseInt).collect(Collectors.toList());
        listInteger.forEach(System.out::print);

        // Pegue os números pares e maiores que 2 e coloque na lista
        System.out.println("\nPegue os números pares e maiores que 2:");
        numeros.stream()
            .map(Integer::parseInt)
            .filter(n -> n%2 == 0 && n > 2)
            .collect(Collectors.toList())
            .forEach(System.out::print);;

        // Mostra e média dos números
        System.out.println("\nMostra a média dos números:");
        numeros.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);

        // Remova os números ímpares
        System.out.println("Remova os números ímapres:");
        List<Integer> listInt = numeros.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        listInt.removeIf(n -> n%2 != 0);
        System.out.println(listInt);
    }
}