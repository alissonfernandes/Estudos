import java.util.Scanner;

/**
 * Leia 20 números inteiros aleatórios (entre 0 e 100) armazenando-os em um vetor.
 * Ao final mostre os números e os seus sucessores.
 * */

public class Ex03 {
    public static void main(String[] args) {

        int[] numeros = new int[20];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            System.out.println("O sucessor de " + numero + " é " + (numero + 1));
        }

    }
}