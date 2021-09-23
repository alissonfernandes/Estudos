function analisar(){
    saudar();
    verVotoObrigatorio();
    mostrarData();
}

// saudação
function saudar(){
    var saudacao = document.getElementById("saudacao");
    var nome = document.getElementsByName("name")[0].value;
    var agora = new Date();
    var hora = agora.getHours();

    if (hora < 12 ){
        saudacao.innerHTML = `Bom dia, ${nome}!`
    }else if(hora <= 18) {
        saudacao.innerHTML = `Boa tarde, ${nome}!`
    }else {
        saudacao.innerHTML = `Boa noite, ${nome}!`
    }
}

// analisar obrigatoriedade do voto
function verVotoObrigatorio(){
    var idade = Number(document.getElementById("idade").value);
    var msn = document.getElementById("resp");

    if (idade < 16) {
        msn.innerHTML = `Você tem <strong>${idade}</strong> anos e é <strong>menor de idade</strong> por isso, você <strong>não vota</strong>`
    } else if(idade >= 16 && idade < 18) {
        msn.innerHTML = `Você tem <strong>${idade}</strong> anos e é <strong>menor de idade</strong> mas, seu voto é <strong>facultativo</strong>`
    }else if(idade >= 18 && idade <= 70) {
        msn.innerHTML = `Você tem <strong>${idade}</strong> anos e é <strong>maior de idade</strong> por isso, seu voto é <strong>obrigatório</strong>`
    }else if(idade > 70) {
        msn.innerHTML = `Você tem <strong>${idade}</strong> anos e é <strong>maior de idade</strong> mas, seu voto é <strong>facultativo</strong>`
    }
 
}

// data da análise
function mostrarData(){
    var data = new Date();
    var diaSemana = "";

    switch (data.getDay()) {
        case 0:
            diaSemana = "Domingo";
            break;
        case 1:
            diaSemana = "Segunda";
            break;
        case 2:
            diaSemana = "Terça";
            break
        case 3:
            diaSemana = "Quarta";
            break;
        case 4:
            diaSemana = "Quinta";
            break;
        case 5:
            diaSemana = "Sexta";
            break;
        case 6:
            diaSemana = "Sábado";
            break;
    }

    var mes = "";
    switch (data.getMonth()){
        case 0:
            mes = "Janeiro";
            break;
        case 1:
            mes = "Fevereiro";
            break;
        case 2:
            mes = "Março";
            break
        case 3:
            mes = "Abril";
            break;
        case 4:
            mes = "Maio";
            break;
        case 5:
            mes = "Junho";
            break;
        case 6:
            mes = "Julho";
            break;
        case 7:
            mes = "Agosto";
            break;
        case 8:
            mes = "Setembro";
            break;
        case 9:
            mes = "Outubro";
            break
        case 10:
            mes = "Novembro";
            break;
        case 11:
            mes = "Dezembro";
            break;
    }

   var dia = document.getElementById('dia');
   dia.innerHTML = `${diaSemana}-feira, ${data.getDate()} de ${mes} de ${data.getFullYear()}`
}