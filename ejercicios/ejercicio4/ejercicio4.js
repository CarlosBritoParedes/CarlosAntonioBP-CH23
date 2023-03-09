// ● Crear un programa en Javascript que realice lo siguiente:
// ○ Debe solicitar al usuario un número por prompt o por input y guardarlo.
// ○ Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8,
// debe mostrar 8 números de la serie de Fibonacci.
// ○ Debe imprimir el resultado por consola o por el DOM.
// ○ Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un
// mensaje de error y volver a solicitar el dato.
// ○ Prueba tu programa con las siguientes combinaciones para asegurarte que funcione correctamente:

let fibonacciSerie=[0,1];
var add = 0;
var numFibonacci=parseInt(prompt("Let me know any number you want: "));

while(Number.isInteger(numFibonacci)===false || numFibonacci === 0){
    alert("The last value was incorrect, please try with an interger number which it is after the zero");
    numFibonacci=parseInt(prompt("Let me know any number you want: "));
}
function fibo(n1){

    if (n1 === 1){
        fibonacciSerie.pop();
        return fibonacciSerie;
    }
    else if (n1 === 2){
        return fibonacciSerie;
    }
    else{
        for (i=2; i<n1; i++){
            var popIt1 = fibonacciSerie.pop();
            var popIt2 = fibonacciSerie.pop();
            var add =popIt1 + popIt2;
            fibonacciSerie.push(popIt2);
            fibonacciSerie.push(popIt1);
            fibonacciSerie.push(add);
        }
        return fibonacciSerie;
    }
}
console.log(fibo(numFibonacci));

// ○ Entrada:
// ■ 3
// ○ Salida:
// ■ 0, 1, 1.
// ○ Entrada:
// ■ 10
// ○ Salida:
// ■ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
// ● Pruébalo con los números que se te ocurran.
// ● Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub.
// ● Colócalo en un repositorio llamado “logica-programacion-4”
// Sugerencias:
// ● La sucesión de Fibonacci es una secuencia infinita de números naturales; a partir del 0 y el 1, se van addando a
// pares, de manera que cada número es igual a la adda de sus dos anteriores, de manera que:
// ○ Sucesión: 0, 1, 1, 2, 3, 5, 8
// ○ 0 + 1 = 1
// ○ 1 + 1 = 2
// ○ 2 + 1 = 3
// ○ 3 + 2 = 5
// ○ 5 + 3 = 8
// ○ …
// © 2022 Generation: You Employed, Inc.
// 3
// SA-LPD4 - Ejercicio de lógica de programación 4 (1 hora, asincrónico)
// ● Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu
// programa.
// ● Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo HTML y enlazar tu script.
// ● Para ayudarte puedes desarrollar un algoritmo y el pseudocódigo.