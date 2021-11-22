import java.util.Scanner;

/**
 * Gera tabuada de qualquer número inteiro entre 1 e 10
 * */
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero);

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}