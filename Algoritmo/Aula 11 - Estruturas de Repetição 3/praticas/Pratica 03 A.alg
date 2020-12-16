algoritmo "semnome"
// Função :
// Autor :
// Pratica 03
// Quantos valores estao entre 0 e 10
var
     v, c, tot:Inteiro
inicio
       Para c <- 1 ate 6 faca
            Escreval("Digite um valor:")
            Leia(v)
            
            Se(v>=0) e (v<=10) entao
                     tot <- tot + 1
            FimSe
       FimPara
       
       Escreval("Ao todo foram ", tot, " valores entre 0 e 10")
       
fimalgoritmo
