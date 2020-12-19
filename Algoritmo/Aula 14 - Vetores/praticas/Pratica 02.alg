algoritmo "semnome"
// Pratica 02
// Listagem da turma
var
  nome: vetor[1..4] de Caractere
  nota1: vetor[1..4] de Inteiro
  nota2: vetor[1..4] de Inteiro
  media: vetor[1..4] de Real
  
  sm, mt:Real
  
  i, tot:Inteiro
inicio
      Para i <- 1 ate 4 faca
         Escreval("Aluno: ", i)
         Escreva("Nome: ")
         Leia(nome[i])
         
         Escreva("Nota 1: ")
         Leia(nota1[i])
         
         Escreva("Nota 2: ")
         Leia(nota2[i])
         
         media[i] <- (nota1[i] + nota2[i])/2
         
         sm <- sm +  media[i]
      FimPara
      
      LimpaTela
      
      mt <- sm/4
      
      Escreval("LISTAGEM DE ALUNOS")
      Escreval("-------------------")
      Para i <- 1 ate 4 faca
             Escreval(nome[i], media[i])
             
             Se (media[i] > mt) entao
                  tot <- tot + 1
             FimSe
      FimPara
      
      Escreval("Ao todo temos ", tot, " alunos acima da media da turma que e ", mt:4:1)
      
// Seção de Comandos 
fimalgoritmo
