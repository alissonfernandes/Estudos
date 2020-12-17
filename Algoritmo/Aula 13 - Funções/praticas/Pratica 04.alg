algoritmo "FibonacciFuncao"
// Função :
// Autor :
// Pratica 04
// Sequncia de Fibonacci com funcao
var
   c, t1, t2, t3:Inteiro

Funcao ProximoFibonacci(var a, b: Inteiro):Inteiro
var
   c:Inteiro
inicio
      c := a + b

      a := b
      b := c
      
      Retorne c
FimFuncao

inicio
      t1 <- 0
      Escreva(t1)
      t2 <- 1
      escreva(t2)

      Para c:= 3 ate 10 faca
               Escreva(ProximoFibonacci(t1, t2))
      FimPara
fimalgoritmo
