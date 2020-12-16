algoritmo "DetectorPesado"
// Função :
// Autor :
// Pratica 01
// Detector de pesado
var
     i:Inteiro
     n, pesado:Caractere
     p, mai:Real
     
Procedimento Topo()
inicio
      LimpaTela
        Escreval("-----------------------------------")
        Escreval("D E T E C T O R   DE   P E S A D O ")
        eSCREVAL("Maior Peso ate agora: ", mai, "Kg")
        Escreval("-----------------------------------")
FimProcedimento
     
inicio
       Topo()
        
        Para i <- 1 ate 5 faca
               Escreva("Digite o nome: ")
               Leia(n)
               Escreval("Digite o peso de ", n, ": ")
               Leia(p)
               
               Se (p>mai) entao
                    mai <- p
                    pesado <- n
               FimSe
               Topo()
        FimPara
          Topo()
        Escreval("A pessoa mais pesada foi ", pesado, " com ", mai, "Kg")


fimalgoritmo
