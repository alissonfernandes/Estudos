import java.util.Scanner;

/**
 * Leia N números inteiros e mostre a quantidade de números pares e ímpares
 * */

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade;
        int par = 0;
        int impar = 0;

        System.out.println("Quantidade de números: ");
        quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número: ");
            if (scanner.nextInt() % 2 == 0) par++;
            else impar++;
        }

        System.out.println("Quantidade de números pares: " + par + "\nQuantidade de números ímpares: " + impar);
    }
}