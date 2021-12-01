public class Main {
    
    public static void main(String[] args) {
      ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

      minhaLista.add("Item 1");
      minhaLista.add("Item 2");
      minhaLista.add("Item 3");
      minhaLista.add("Item 4");

      System.out.println(minhaLista);
      System.out.println(minhaLista.remove(3));
      System.out.println(minhaLista);
      System.out.println(minhaLista.remove(1));
      System.out.println(minhaLista);
    }
}
