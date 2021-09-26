criarVetor();
function criarVetor() {
    let num = [90, 10, 15, 20, 25]

    num.push(0)

    console.log(`Vetor: ${num}`);
    console.log(`Length: ${num.length}`)
    num.sort()
    console.log('Sort: ' + num)

   for (let indice in num) {
      console.log(num[indice])
   }

   console.log(num.indexOf(20))
}