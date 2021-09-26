function contar(){
    var inicio = Number(document.getElementById('ini').value);
    var fim = Number(document.getElementById('fim').value);
    var passo = Number(document.getElementById('passo').value);

    if(passo <= 0){
        window.alert(`Passo não pode ser igual a ${passo} por isso, sera considerado como 1`);
        passo = 1;
    }

   
    var res = document.getElementById('res');
    let i = inicio
    let f = fim
    let p = passo
    
    res.innerHTML = `Contar: `;

    // crescente
    if(i < f) {

        for(let c = i; c <= f; c += p){
            res.innerHTML += `${c} `;
         }
    // regressivo 
    } else {

        for(let c = i; c >= f; c -= p){
            res.innerHTML += `${c} `;
         }

    }
  
}