public class Main {
    
    public static void main(String[] args) {

        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("01");
        System.out.println(minhaLista);

        minhaLista.remove(0);;
        System.out.println(minhaLista);

        minhaLista.add("01");
        System.out.println(minhaLista);

        minhaLista.add("02");
        minhaLista.add("03");
        minhaLista.add("04");

        System.out.println(minhaLista);

        System.out.println(minhaLista.get(5));


    }


}
