import java.util.Scanner;

public class Ex02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println(nome + " possui filhos? (true/false): ");
        boolean temFilhos = scanner.nextBoolean();

        System.out.println(nome + ", quanto é o valor do seu salário?: ");
        float salario = scanner.nextFloat();

        System.out.println("Merece aumento?: " + ((salario < 1000) && (temFilhos)));
    }
}