public class Contato {
    
    private String nome;
    private int numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
       this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public String toString() {
        return "contato{nome: "+this.nome+", numero: "+this.numero+"}";
    }

}
