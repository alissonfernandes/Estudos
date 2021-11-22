import java.util.Scanner;

/**
 * Leia 5 números inteiros e mostre a sua ordem inversa
 * */

public class Ex01 {
    public static void main(String[] args) {

        int[] vetor = new int[5];

        Scanner scanner = new Scanner(System.in);

       for (int i = 0; i < 5; i++) {
           System.out.println("Digite um número: ");
           vetor[i] = scanner.nextInt();
       }

        System.out.print("Nova ordem: ");

       int cont = vetor.length - 1;
       while (cont >= 0) {
           System.out.print(vetor[cont--] + " ");
       }
    }
}