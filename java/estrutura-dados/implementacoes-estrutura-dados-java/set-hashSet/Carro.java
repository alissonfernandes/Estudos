import java.util.Objects;

public class Carro implements Comparable<Carro>{
    String marca;

    public Carro(String marca) {
       this.marca = marca; 
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carro carro = (Carro) o;
        return Objects.equals(this.marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.marca);
    }

    @Override
    public String toString() {
        return "Carro{marca: " + this.marca + "}";
    }

    @Override
    public int compareTo(Carro o) {

        // Por tamanho da String
        /* 
        if(this.marca.length() < o.marca.length()) {
            return -1;
        } else if(this.marca.length() > o.marca.length()) {
            return 1;
        }
        return 0;*/

        return this.marca.compareTo(o.marca);
    }
}
