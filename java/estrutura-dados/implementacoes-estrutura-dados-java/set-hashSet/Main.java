import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Set<Carro> hashsetCarros = new HashSet<>();

        // Add elementos * Obs: não segue a ordem de inserção
        hashsetCarros.add(new Carro("Ford"));
        hashsetCarros.add(new Carro("Chevrolet"));
        hashsetCarros.add(new Carro("Fiat"));
        hashsetCarros.add(new Carro("Zip"));
        hashsetCarros.add(new Carro("Alfa"));

        System.out.println(hashsetCarros);


        Set<Carro> treeSetCarros = new TreeSet<>();

        // Add elementos * Obs: a inserção segue a ordem alfabética
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa"));
        treeSetCarros.add(new Carro("Marca X"));

        System.out.println(treeSetCarros);
    }
}