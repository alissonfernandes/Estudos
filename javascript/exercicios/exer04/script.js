function gerar(){
    var numero = Number(document.getElementById('txti').value);
    let select = document.getElementById('seltab')

    select.innerHTML = '';
    for(var i = 0; i <= 10; i++){
        let item = document.createElement('option');
        item.text = `${numero} X ${i} = ${numero*i}`
        select.appendChild(item);
    }
}