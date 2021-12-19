import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNumero implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
        return  Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
    
}
