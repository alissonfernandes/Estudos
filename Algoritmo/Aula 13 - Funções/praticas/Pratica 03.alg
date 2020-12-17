algoritmo "Fatorial"
// Pratica 03
// Fatorial de um numero
var
   n:Inteiro
   
   Funcao   fatorar(v:Inteiro):Inteiro
   var
      i, res:Inteiro
   inicio
         res <- 1
   
       Para i <- 1 ate v faca
           res <- res * i
       FimPara
       
       Retorne res
   
   FimFuncao
inicio
      Escreval("Digite um numero: ")
      Leia(n)
      
      Escreval("O valor de ", n, "! e igual a ", fatorar(n))

fimalgoritmo
