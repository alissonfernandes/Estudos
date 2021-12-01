package fila;

public class No<T> {
    
    private T object;
    private No<T> refNo;

    public No() {}

    public No(T object) {
        this.object = object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Object getObject() {
        return this.object;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public No getRefNo() {
        return this.refNo;
    }

    @Override
    public String toString() {
        return "No{Object: " + this.object + "}";
    }
}
