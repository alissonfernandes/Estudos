import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Bruno");
        aluno.put("Idade", "20");
        aluno.put("Sexo", "M");

        System.out.println(aluno);

        // Retorna todas as cheves
        System.out.println(aluno.keySet());

        // Retorna todos os valores
        System.out.println(aluno.values());

        // Verifica se contém uma determinada chave
        System.out.println(aluno.containsKey("Nome"));
        
    }
}
