import java.util.Objects;

public class Carro {
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
}
