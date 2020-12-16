algoritmo "semnome"
// Função :
// Autor :
// Pratica 03
// Sequncia de Fibonacci
var
   c, t1, t2, t3:Inteiro

Procedimento ProximoFibonacci(var a, b: Inteiro)
var
   c:Inteiro
inicio
      c := a + b
      Escreva(c)
      
      a := b
      b := c

FimProcedimento

inicio
      t1 <- 0
      Escreva(t1)
      t2 <- 2
      escreva(t2)
      
      Para c:= 3 ate 10 faca
               ProximoFibonacci(t1, t2)
      FimPara
fimalgoritmo
