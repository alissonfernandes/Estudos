import java.util.Scanner;

/**
 * Leia um vetor de 6 caracteres e diga quantas consoantes foram lidas e mostre mostre-as
 * */

public class Ex02 {
    public static void main(String[] args) {

        String[] vogal = {"a", "e", "i", "o", "u"};
        String consoantes = "";

        int quantConsoante = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um caractere: ");
            String caractere = scanner.nextLine();

            if (!(caractere.equals(vogal[0]) || caractere.equals(vogal[1]) || caractere.equals(vogal[2])|| caractere.equals(vogal[3]) || caractere.equals(vogal[4]))) {
                quantConsoante++;
                consoantes += caractere + " ";
            }

        }

        System.out.println("Quantidade de consoantes: " + quantConsoante);
        System.out.println("Consoantes: " + consoantes);
    }

}