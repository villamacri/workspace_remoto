function info(cadena){
    let resultado = "La cadena \""+cadena+"\" ";


    if(cadena == cadena.toUpperCase()){
        resultado += " está formada sólo por mayúsculas";
    }
    else if(cadena == cadena.toLowerCase()){
        resultado += " está formada por minúsculas";
    }
    else{
        resultado += " está formada por mayúsculas y minúsculas";
    }

    return resultado;
}

alert(info("LA MADRE DE PANETE EN PATINETE"));
alert(info("Me quitaron de mejores amigos..."));