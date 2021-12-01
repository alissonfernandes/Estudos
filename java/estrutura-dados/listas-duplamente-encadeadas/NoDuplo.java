
public class NoDuplo<T> {

   private T conteudo; 
   private NoDuplo<T> noProximo;
   private NoDuplo<T> noPrevio;

   public NoDuplo(T conteudo) {
       this.conteudo = conteudo;
   }


   public void setConteudo(T conteudo) {
       this.conteudo = conteudo;
   }

   public T getConteudo() {
       return this.conteudo;
   }

   public void setNoProximo(NoDuplo<T> noProximo) {
       this.noProximo = noProximo;
   }

   public NoDuplo<T> getNoProximo() {
       return this.noProximo;
   }

   public void setNoPrevio(NoDuplo<T> noPrevio) {
       this.noPrevio = noPrevio;
   }

   public NoDuplo<T> getNoPrevio() {
       return this.noPrevio;
   }

   @Override
   public String toString() {
       return "NoDuplo{conteudo: " + this.conteudo + "}";
   }
}
