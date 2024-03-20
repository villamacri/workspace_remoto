 let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

let numDni = prompt('Diga su número de DNI');
let letraDni = prompt('Indique la letra de su DNI');

numDni<0 || numDni>99999999?alert('Número no válido'):numDni%23;

let numLetra = numDni%23;

if(letras[numLetra]==letraDni){
    alert('La letra coincide, es correcto')
}else{
    alert('La letra no coincide')
}