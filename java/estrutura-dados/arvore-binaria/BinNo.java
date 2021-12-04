public class BinNo <T extends Comparable<T>>{

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }

    public BinNo(){
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setNoEsq(BinNo<T> NoEsq) {
        this.noEsq = NoEsq;
    }

    public BinNo<T> getNoEsq() {
        return this.noEsq;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    public BinNo<T> getNoDir() {
        return this.noDir;
    }

    @Override
    public String toString() {
        return "BinNo{conteudo: " + this.conteudo + "}";
    }
}