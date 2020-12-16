algoritmo "semnome"
// Função :
// Autor :
// Exercicio 02
// Analisador de valores
// Exibir soma dos valores, quantos são divisíveis por 5, quantos são núlos, soma dos pares
var
        i, v, tot, contDivCinco, nulo, pares:Inteiro
inicio
      tot <- 0
      contDivCinco <- 0
      nulo <- 0
      pares <- 0
      
      Para i <- 1 ate 5 faca
             Escreval("Digite o ", i, " o. Valor:")
             Leia(v)
             
             tot <- tot + v
             
             Se ((v%5=0) entao
                 contDivCinco <- contDivCinco + 1
             FimSe
             
             Se (v=0) entao
                 nulo <- nulo + 1
             FimSe
             
             Se (v%2=0) entao
                pares <- pares + v
             FimSe
             
             
      FimPara
      Escreval("A soma entre os valores e ", tot)
      Escreval("A media entre os valores e ", tot/5)
      Escreval("Valores divisiveis por cinco: ", contDivCinco)
      Escreval("Valores nulos: ", nulo)
      Escreval("A soma dos valores pares e ", pares)

fimalgoritmo
