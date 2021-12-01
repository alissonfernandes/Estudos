package pilha;

public class No {
    
    private int dado;
    private No refNo;

    public No(int dado) {
        this.dado = dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return this.dado;
    }

    public void setRefNo(No reNo) {
        this.refNo = reNo;
    }

    public No getRefNo() {
        return this.refNo;
    }

    @Override
    public String toString() {
        return "No{dado: " + dado + "}";
    }
}
