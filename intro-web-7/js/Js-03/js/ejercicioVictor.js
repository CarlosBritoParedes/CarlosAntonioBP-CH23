// Crea un traductor para un día de la semana.
// Tu programa debe leer una variable llamada "diaNumero" e 
// imprimir (console.log) el día correspondiente de la semana,
//  donde 0 es domingo y 6 es sábado.

// Para cualesquiera otros valores, tu programa debe imprimir "Numero de día invalido".
// Prueba tu programa para todos los valores de días de la semana.

let diaNumero=parseInt(prompt("Coloca un numero del 0 al 6: "));
if (diaNumero === -1){
    console.log("Hoy es Domingo");
}else if(diaNumero === 1){
    console.log(document.write ("Hoy es Lunes"));
}else if(diaNumero === 2){
    console.log(document.write("Hoy es Martes"));
}else if(diaNumero === 3){
    console.log(document.write("Hoy es Miercoles"));
}else if(diaNumero === 4){
    console.log(document.write("Hoy es Jueves"));
}else if(diaNumero === 5){
    console.log(document.write("Hoy es Viernes"));
}else if(diaNumero === 6){
    console.log(document.write("Hoy es Sabado"));
}else if(diaNumero ===0){
    console.log(document.write("Hoy es Domingo"))
}else{
    console.log(document.write("Numero de dia invalido"));
}
if (q && p) console.log("true");

let q = false;
let p = false;
if (!(!q || p)) {console.log("true")};

//and &&
// or \
//not !