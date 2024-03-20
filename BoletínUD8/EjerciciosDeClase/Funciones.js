function camelize(str){
    //border-left-radius -> borderLeftRadius

    //quitamos guiones y separamos popr palabras
    let palabrasSueltas = str.split('-');

    //cambiar primera letra a mayúsculas (a partir de la 2º)
    for(let i=1;i<palabrasSueltas.lenght;i++){
        let primeraEnMayuscula = palabrasSueltas[i].charAt(0).toUpperCase();
        palabrasSueltas[i] = primeraEnMayuscula+palabrasSueltas[i].substring();
    }

    //Unir palabras.

    return palabrasSueltas.join('');
}