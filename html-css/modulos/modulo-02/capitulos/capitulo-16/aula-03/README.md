# Aula 02: Modelo de caixas na prática (pt.2)

## Anatomia da caixa
* 'height' -> altura
* 'width' -> largura
* 'border' -> borda 
* 'padding' -> preenchimento
* 'margin' -> margem da caixa
* 'autline' -> borda externa

* ### border (borda)
 Propriedade usada para criar uma borda em volta da caixa
 * 'border-width' -> espessura da borda
 * 'border-style' -> estilo da borda
 * 'border-color' -> cor da borda
 * border: [width] [style] [color] -> utilizado para simplificar as propriedades do border  Veja em exemplo abaixo: 
 border: 10px solid red;

* ### padding (preenchimento)
 Propriedade usada para criar espaçamento entre o conteúdo e a borda.
 * padding-top -> preenchimento do topo
 * padding-right -> preenchimento da direita
 * padding-left - > preenchimento da esquerda
 * padding-bottom - > preenchimento do baixo 
 * padding: [top] [right] [bottom] [left] -> utilizado para simplificar as propriedades do padding. Veja em exemplo abaixo: 
 padding: 10px 10px 10px 10px;
 * padding: [top-bottom] [right-left] -> utilizado para simplificar a medida do topo/baixo e da direira/esquerda do padding. Veja em exemplo abaixo: 
 padding: 10px 20px;

* ### margin (margem)
 Propriedade usada para criar espaçamento entre as caixas.
 * margin-top -> margem do topo
 * margein-right -> margem da direita
 * margin-left -> margim da esquerda
 * margin-bottom -> margin do baixo
 * margin: [top] [right] [bottom] [left] -> utilizado para simplificar os 4 lados da margem em uma só linha de código. Veja o exemplo abaixo:
 padding: 10px 10px 10px 10px;
 * margin: [top] auto [bottom] auto -> utilizado para simplificar os 4 lados da margem sendo que o right e o left serão configurados automaticamante para a caixa ficar centralizado horizontalmente. Exemplo:
 margin: 10px auto 20px auto;
 * margin: auto -> centraliza a caixa horizotalmente

* ### outline
 Propiedade aplicado entre a borda e a margem. Funciona como uma borda externa.
 * outline-width -> tamanho do espaçamento entre a borda e a margem
 * outline-style -> estilo da outline
 * outline-color -> cor da outline
 * autline: [width] [style] [color] -> maneira simplificada para representar as propriedades do outline listadas acima. Exemplo:
 outline: 5px solid red;
