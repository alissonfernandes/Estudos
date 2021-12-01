public class No<T> {

    private T conteudo;
    private No<T> noProximo;

    public No(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    public No<T> getNoProximo() {
        return this.noProximo;
    }

    @Override
    public String toString() {
        return "No{conteudo: " + this.conteudo + "}";
    }
}