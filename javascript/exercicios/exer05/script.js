let numeros = [];
let select = document.getElementById('valores')

function adicionar(){
    let numero = Number(document.getElementById('txtn').value)

    if(isNumber(numero && !inList(numero, numeros))){
        let option = document.createElement('option')
        option.text = `Valor: ${numero} adicionado`
        numeros.push(numero)
        select.appendChild(option)
    } else {
        window.alert('Valor inválido ou já encontrado na lista')
    }
   
}

function finalizar(){
    select.text = ''
    
    let res = document.getElementById('res')

    if(numeros.length == 0){
        window.alert('Adicione valores antes de finalizar.')
    } else {
        let maior = numeros[0];
        let menor = numeros[0];
        let soma = 0;

        for (let pos in numeros) {
            soma += numeros[pos]
           if(numeros[pos] > maior){
               maior = numeros[pos]
           }
           if(numeros[pos] < menor){
               menor = numeros[pos]
           }
        }

        res.innerHTML = ''
        res.innerHTML += `<p>Ao todo temos ${numeros.length} números cadastrados</p>`
        res.innerHTML += `<p>O maior número informado foi ${maior}.</p>`
        res.innerHTML += `<p>O menor número informado foi ${menor}.</p>`
        res.innerHTML += `<p>A soma entre os valores é ${soma}.`
        res.innerHTML += `<p>A média dos valores é ${soma/numeros.length}.`
    }
}

function isNumber(n){
    if(n >= 1 && n <= 100){
        return true;
    } else {
        return false;
    }
}

function inList(n, list){
    if(list.indexOf(n) != -1){
        return true
    } else {
        return false
    }
}
