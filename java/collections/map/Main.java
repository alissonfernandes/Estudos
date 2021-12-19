import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Main{

    public static void main(String[] args) {
        

        // Crie um dicionário que relacione os modelos e seus respectivos valores (carro, consumo)
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println("Carros populares: " + carrosPopulares);

        // Substitua o consumo do Gol por 15.2 km/l
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        // Confira se o modelo Tucson está no dicionário
        System.out.println("Carros populares possui 'Tucson': " + carrosPopulares.containsKey("Tucson"));

        // Exiba o consumo do Uno
        System.out.println("Consumo do Uno: " + carrosPopulares.get("Uno"));

        // Exiba os modelos
        System.out.println("Modelos: " + carrosPopulares.keySet());

        // Exiba os consumos
        System.out.println("Consumos: " + carrosPopulares.values());

        // Exiba o modelo mais econômico e seu consumo
        System.out.print("Modelo mais econômico: ");
        Double maisEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for(Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(maisEconomico)) System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        // Exiba o modelo menos econômico seu consumo
        System.out.print("Modelo menos econômico: ");
        Double menosEconomico = Collections.min(carrosPopulares.values());
        for(Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(menosEconomico)) System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        // Exiba a soma dos consumos
        System.out.print("Soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) soma += iterator.next();
        System.out.println(soma);

        // Exiba a média dos consumos
        System.out.println("Média dos consumos: " + (soma/carrosPopulares.size()));

        // Remova os modelos com o consumo igual a 15.6
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            if(iterator2.next().equals(15.6)) iterator2.remove();
        }
        System.out.println("Remova modelos com consumo igual a 15.6: " + carrosPopulares);

        // Exiba todos os carros na ordem em que foram informados: 
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println("Ordem em que foram informados: " + carrosPopulares2);

        // Exiba o dicionário ordenado pelo modelo
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println("Dicionário ordenado pelo modelo: " + carrosPopulares3);

        // Apague o dicionário de carros
        carrosPopulares3.clear();
        System.out.println("Dicionário está vazio: " + carrosPopulares3.isEmpty());
    }
}