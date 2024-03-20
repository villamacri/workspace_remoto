alert(ej11());

function ej11(){

let tamanio = prompt("Diga cantidad de números")
let arr = [];
let num
arr.length=tamanio;
for(let i=1;i<(parseInt(tamanio)+1);i++){
    num = prompt("Diga número")
    arr.push(num);
}
alert(arr);

let nuevonum = prompt('Diga otro número para guardar');
while(nuevonum!=='' || isNaN(nuevonum)){
    arr.unshift(nuevonum);
    nuevonum = prompt('Diga otro número para guardar');
}
return (arr);

}