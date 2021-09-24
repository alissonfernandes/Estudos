function load(){
    var msg = window.document.getElementById('msg');
    var img = window.document.getElementById('imagem');

    var data = new Date();
    var hora = data.getHours();

    msg.innerHTML = `São ${hora} horas`

    if(hora >= 0 && hora <12) {
        img.src = 'img/manha.png';
        img.alt = 'Nascer do sol visto do mar'
        document.body.style.background = '#e2cd9f';
    }else if(hora >= 12 && hora < 18) {
        img.src = 'img/tarde.png';
        img.alt = 'Um barco no meio do mar em uma tarde'
        document.body.style.background = '#b9846f';
    } else{
        img.src = 'img/noite.png';
        img.alt = 'Lua em meio a escuridão da noite'
        document.body.style.background = '#515154';
    }


}