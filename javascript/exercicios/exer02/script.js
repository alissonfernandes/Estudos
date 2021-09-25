function verificar() {
    var date = new Date();
    var ano = date.getFullYear();
    var personAno = Number(document.getElementById('txtano').value);
    var res = document.getElementById('res');

    if(personAno == 0 || personAno > ano) {
        window.alert('Ano de nascimento incorreto. Tente novamente');
    } else {
        var personSex = document.getElementsByName('radsex')
        var idade = ano - Number(personAno);
        var genero = '';

        var img = document.createElement('img');
        img.setAttribute('id', 'foto');

        // homem
        if(personSex[0].checked) {
            genero = 'Homem';

            if(idade < 12){
                // criança
                img.setAttribute('src', 'img/crianca-m.png')
            } else if(idade < 21) {
                // jovem
                img.setAttribute('src', 'img/jovem-m.png')
            } else if(idade < 50) {
                // adulto
                img.setAttribute('src', 'img/adulto-m.png');
            }else {
                // idoso
                img.setAttribute('src', 'img/idoso-m.png')
            }

        // mulher
        } else if(personSex[1].checked){
            genero = 'Mulher';

            if(idade < 12){
                // criança
                img.setAttribute('src', 'img/crianca-f.png');
            } else if(idade < 21) {
                // jovem
                img.setAttribute('src', 'img/jovem-f.png');
            } else if(idade < 50) {
                // adulta
                img.setAttribute('src', 'img/adulto-f.png');
            }else {
                // idosa
                img.setAttribute('src', 'img/idoso-f.png');
            }
        }

        res.innerHTML = `Detectamos ${genero} com ${idade} anos`;
        res.appendChild(img);
    }
}