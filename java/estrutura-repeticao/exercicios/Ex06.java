import java.util.Scanner;

/**
 * Calcula o fatorial de um número inteiro fornecido pelo usuário
 * */

public class Ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para fatorar: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++ ) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + "! é: " + fatorial);
    }
}