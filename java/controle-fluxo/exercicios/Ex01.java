import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de doação para uma instituição de caridade\nVocê deseja realizar uma doação? (sim/nao):");

        if (scanner.nextLine().equals("sim")) {

            System.out.println("Para fazer essa doação informe o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Agora informa a sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 18) {
                System.out.println(nome + ", infelizmente você NÃO pode realizar essa doação, pois você é MENOR de idade");
            } else {
                System.out.println(nome + ", para realizar a doação, digite o número da opção desejada:");
                System.out.println("\t1 - para doar R$5,00\n\t2 - para doar R$10,00\n\t3 - para doar R$20,00\n\t4 - para doar R$50,00\n\t5 - para doar R$100,00");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println(nome + ", você acaba de doar R$5,00");
                        break;
                    case 2:
                        System.out.println(nome + ", você acaba de doar R$10,00");
                        break;
                    case 3:
                        System.out.println(nome + ", você acaba de doar R$20,00");
                        break;
                    case 4:
                        System.out.println(nome + ", você acaba de doar R$50,00");
                        break;
                    case 5:
                        System.out.println(nome + ", você acaba de doar R$100,00");
                    default:
                        System.out.println("Opção inválida");
                }
            }
        } else {
            System.exit(0);
        }
    }
}