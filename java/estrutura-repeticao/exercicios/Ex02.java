import java.util.Scanner;

/**
 * Ler uma nota entre ZERO e DEZ.
 * Continuar insistindo caso usuário não informe o que lhe foi pedido.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

       do {
           System.out.println("Nota de 1 até 10: ");
           nota = scanner.nextInt();

           if (nota < 0 || nota > 10) System.out.println("Nota inválida! Digite uma nota entre 0 e 10");

       } while (nota < 0 || nota > 10);
    }
}