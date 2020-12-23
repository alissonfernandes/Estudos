algoritmo "semnome"
// Pratica 02
// Ler uma matriz 3x3 e mostrar os pares
var
   valores: vetor[1..3, 1..3] de Inteiro
   l,c, totPar:Inteiro
inicio
      Para l <- 1 ate 3 faca
           Para c <- 1 ate 3 faca
                   Escreva("Digite um valor da posicao [", l, ",", c, "]: ")
                   Leia(valores[l,c])
           FimPara
      FimPara
      
      LimpaTela
      
      totPar <- 0
      Para l <- 1 ate 3 faca
           Para c <- 1 ate 3 faca
                Se (valores[l,c] % 2=0) entao
                     Escreva("{", valores[l,c], "}":2)
                     totPar <- totPar + 1
                senao
                 Escreva(valores[l,c]:4)
                FimSe
           FimPara
           Escreval()
      FimPara
      
      Escreval("Ao todo foram digitados ", totpar, " numeros pares.")
fimalgoritmo

