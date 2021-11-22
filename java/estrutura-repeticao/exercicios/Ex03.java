import java.util.Scanner;
/**
* Leia 5 valores e informa o maior valor e a média entre eles.
*/
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorMaior = 0;
        int soma= 0;

       for (int i = 0; i < 5; i++) {
           System.out.println("Digite um número: ");
           int valor = scanner.nextInt();

           if (valor > valorMaior) valorMaior = valor;

           soma += valor;
       }

        System.out.println("O maios valor é: " + valorMaior);
        System.out.println("A média entre os valores é: " + (soma/5));

    }
}