
public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    } 

    public String getSexo() {
        return this.sexo;
    }

    @Override
    public String toString() {
      return "{nome: " + this.nome + ", idade: " + this.idade + ", sexo: " + this.sexo + "}";  
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.getNome().compareToIgnoreCase(pessoa.getNome());
    }

}
