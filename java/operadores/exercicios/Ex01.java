import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Idade:");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + " você é menor de idade?: " + (idade <= 18));
    }
}