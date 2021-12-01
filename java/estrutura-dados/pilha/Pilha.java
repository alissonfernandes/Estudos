package pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return this.refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return this.refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------------\n";
        stringRetorno += "\tPilha\n";
        stringRetorno += "-------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if(noAuxiliar != null){
                stringRetorno += "[{dado: " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else break;
        }

        stringRetorno += "====================\n";
        return stringRetorno;
    }
}
