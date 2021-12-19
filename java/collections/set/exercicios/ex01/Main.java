

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Séries sem odem
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Dram", 60));
            add(new Serie("That '70s show", "Comédia", 50));
        }};
    
        System.out.println("Minhas Séries");
        for(Serie serie : minhasSeries) System.out.println(serie);


        // Séries em ordem de inserção
        Set<Serie> ordemInsercao = new LinkedHashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Dram", 60));
            add(new Serie("That '70s show", "Comédia", 50));
        }};
        System.out.println("\nMinhas Séries - Em Ordem de Inserção:");
        for(Serie serieInsercao : ordemInsercao) System.out.println(serieInsercao);

        // Séries em ordem por tempo de episódio
        System.out.println("\nMinhas Séries - Em Ordem de Tempo de Duração");
        Set<Serie> minhaSerie2 = new TreeSet<>(minhasSeries);
        for(Serie serieTempDuracao : minhaSerie2) System.out.println(serieTempDuracao);

        // Séries em ordem por Nome, Genero e Tempo de Episódio
        System.out.println("\nMinhas Séries  - Em ordem por Nome, Genero e Tempo de Episódio");
        Set<Serie> minhaSeries3 = new TreeSet<>(new ComparatorSerie());
        minhaSeries3.addAll(minhasSeries);
        for(Serie s : minhaSeries3) System.out.println(s.getNome()+" - "+s.getGenero()+" - "+s.getTempoEpisodio());     
    }
    

}
