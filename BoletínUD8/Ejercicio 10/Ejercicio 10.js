let pal = "La ruta nos aporto otro paso natural";
alert(pal)

function esPalindromo(str) {
    str = str.toLowerCase();
    let strfinal = str.split(' ').join('');
    return strfinal === strfinal.split('').reverse().join('');
}

if(esPalindromo(pal)){
    alert("Es palíndromo")
}else{
    alert("No es palíndromo")
}