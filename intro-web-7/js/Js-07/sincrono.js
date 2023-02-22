// JavaScript sincrono
alert("cohorte23");
console.log("Hola buen dia");
alert("dia del gatito");
console.log("adios");

// setTime(
//     function(){
//         console.log("Hola mundo, con retraso");
//     }, 0 )   console.log("sorpresa");


const myCollback = () => console.log("Hola mundo con retraso");
setTimeout(myCollback, 0);
console.log("sorpresa");