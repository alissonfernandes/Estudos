import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listcarros = new ArrayList<>();

        listcarros.add(new Carro("Ford"));
        listcarros.add(new Carro("Chevrolet"));
        listcarros.add(new Carro("Fiat"));

        // Verifica se a lista contém um elemento específico passado por parâmetro
        System.out.println(listcarros.contains(new Carro("Ford")));

        // Retorna o elemento de determinado índice informado pelo parâmetro
        System.out.println(listcarros.get(2));

        // Retorna o índice do elemento passado por parâmetro
        System.out.println(listcarros.indexOf(new Carro("Chevrolet")));

        // Remove elemento da lista através do índice passado pelo parâmetro
        System.out.println(listcarros.remove(0));
        System.out.println(listcarros);
    }
}
