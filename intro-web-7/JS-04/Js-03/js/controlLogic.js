let hora = Number(prompt("Indica la hora"));

if(hora >= 6 && hora <= 11){
    document.write("Buenos dias");
}else if(hora >= 12 && hora <= 18){
    document.write("Buenas tardes");
}else if(hora >= 19 && hora <= 23){
    document.write("Buenas noches");
}else if(hora >= 0 && hora <= 5){
    document.write("Dejame dormir");    
}else{
    document.write("Hora no valida")
}


// switch (expresión) {
//     case valor1:
//       //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor1
//       [break;]
//     case valor2:
//       //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
//       [break;]
//     ...
//     case valorN:
//       //Declaraciones ejecutadas cuando el resultado de expresión coincide con valorN
//       [break;]
//     default:
//       //Declaraciones ejecutadas cuando ninguno de los valores coincide con el valor de la expresión
//       [break;]
//   }