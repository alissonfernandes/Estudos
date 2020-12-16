algoritmo "ParOuImpar"
//Pratica 02
// Verificar par/impar
var
   n:Inteiro
   
Procedimento ParOuImpar(v:Inteiro)
inicio
      Se (v%2=0)entao
           Escreval("O numero ", v, " e PAR")
      Senao
           Escreval("O numero ", v, " e IMPAR")
      FimSe


FimProcedimento

inicio
      Escreval("Digite um numero: ")
      Leia(n)
      ParOuImpar(n)

fimalgoritmo
