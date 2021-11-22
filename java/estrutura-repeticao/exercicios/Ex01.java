import java.util.Scanner;
/*
* Ler um conjunto de dois valores, o primeiro representando o nome e o segundo representando a idade
*/
public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continua = true;

        while (continua) {
            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equals("0")) continua = false;

            System.out.println("Idade: ");
            int idade = scanner.nextInt();
        }
    }
}