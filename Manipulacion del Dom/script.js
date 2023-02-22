/*

Que encontramos en el arbol del DOM?

    - Node: Es la unidad mas basica dentro del documento. Puede ser una etiqueta, un
    texto dentro de una etiqueta o un comentario, etc.

        <tittle> NODO
            Manipulacion DOM //Es un nodo, pero es hijo del tittle 
            </tittle>

    - Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del
    cual se desarrollan o generan todos los demas nodos.

    - Element: Son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

    - Atributes: Son nodos que dan informacion asociada a un tipo de elemento

    - Comentarios: Comentarios y otros elementos que estan dentro del
    HTML, son considerados nodos.


*/

/*Como Leer nodos de mi Document Object Model (DOM)


Metodos tradicionales (que se usan en versiones antiguas de JS)

    - document.getElementById (botonSuma)
    - document.getElementByTagName (<button>)
    - document.getElementsByClassName (botones)
*/

// var elementID = document.getElementById("botonSuma");
// console.log(elementID);

// var elementoEtiqueta = document.getElementsByTagName("button");
// console.log(elementoEtiqueta);
// console.log("Este es el primer elemento de mi coleccion de botones", elementoEtiqueta[0]);



// var elementoClassName = document.getElementsByClassName("botones");
// console.log(elementoClassName);


// /*

// Metodos recientes

//     - document.querySelector(#botonSuma)
//     - document.querySelectorAll(.botones)
// */


// var variosElemento = document.querySelectorAll(".botones");
// console.log(variosElemento);





/*

Creacion de Nodos

    - document.createElement(tipoNodo)


*/

//Creacion de una etiqueta de tipo imagen
var imagenPerrito = document.createElement("img");

//Creamos atributos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenPerrito.alt = "Foto de perrito tierno"
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "100px";




//Poner elementos o nodos en el html
document.body.append(imagenPerrito);


//Actualizar nodos
//1er paso: Identificar el nodo que quiero cambiar (outer)
//2do paso: Modificar el nodo (inner)


var resultadoQueCambia = document.getElementById("resultado");

resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas";



//Construir nuestra calculadora
var input1 = document.gerElementById("input1");
var input2 = document.getElementById("input2");


var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");


var resultado = document.getElementById("resultado");



