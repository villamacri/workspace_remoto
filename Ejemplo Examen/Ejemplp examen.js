principal();

/*
Escribe la función sortear(arr) que recibe como parámetro un array
/


function sortear(arr){
    let desde = 0;
    let hasta = arr.length;
    let numAleatorio;
    //Math.floor(Math.random()10);
    numAleatorio = Math.floor(desde+Math.random()hasta);
    return arr[numAleatorio];
}

/
Escribe la funcion camelize(str). Esta función recibe un único parámetro tipoString. Se espera que la función convierta...
/

function camelize(str){
    //convierte border-left-radius en borderLeftRadius

    //quitamos guiones y separamos por palabras
    let palabrasSueltas = str.split('-');

    //cambiar primera letra a mayúsculas (a prtir de la 2a)
    for(let i = 1; i<palabrasSueltas.length; i++){
        let primeraEnMayus = palabrasSueltas[i].charAt(0).toUpperCase();
        palabrasSueltas[i]=primeraEnMayus+palabrasSueltas[i].substring(1);
    }

    //unir las palabra
    return palabrasSueltas.join('');
}


/
Escribe la función pedirNombres() que solicite al usuarui una serie de nombres y porpuedades CSS y se guarden un array. El tama´p del array

*/

function pedirNombres(){
    let resultado = new Array();

    let texto = prompt("Introduzca un texto");

    while(isNaN(texto)){
        resultado.push(texto);
        texto = prompt("Introduzca un texto")
    }

    return resultado;
}

///////////////

function principal(){
    let propiedadesCSS = pedirNombres();

    for(let i=0;i<propiedadesCSS.length;i++){
        propiedadesCSS[i] = camelize(propiedadesCSS[i]);
    }

    alert("El escogido es "+sortear(propiedadesCSS));

}