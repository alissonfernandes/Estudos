algoritmo "semnome"
// Função :
// Autor :
// Pratica 03
// Quantos valores estao entre 0 e 10 e exibir a soma entre os numeros impares digitados
var
     v, c, tot, sImp:Inteiro
inicio
      tot <- 0
      sImp <- 0
      
       Para c <- 1 ate 6 faca
            Escreval("Digite um valor:")
            Leia(v)

            Se(v>=0) e (v<=10) entao
                     tot <- tot + 1
                     
                     Se(v%2=1) entao
                          sImp <- sImp + v
                     FimSe
            FimSe
       FimPara

       Escreval("Ao todo foram ", tot, " valores entre 0 e 10")
       Escreval("Nesse intervalo, a soma de impares foi ", sImp)

fimalgoritmo

