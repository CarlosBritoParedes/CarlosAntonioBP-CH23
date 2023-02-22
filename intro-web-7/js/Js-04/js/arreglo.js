let lista = [12,5,80,34,7];
let lNueva = lista.map(
    function(valor){
        return valor * 2
    }
);
console.log(lNueva);



lista.sort(
    function(valor1,valor2){
        return valor1 > valor2;
    }

)
console.log(lista);


lista.sort();
console.log(lista);


lista.reverse();
console.log(lista);


let remover = lista.splice (1,2);
console.log(remover);
console.log(lista);
lista.splice(2,0,100,200,300);
console.log(lista);


lista.shift();
console.log(lista);

lista.pop();
console.log(lista);

lista.push(100,89,90);
console.log(lista);

let masE= lista.concat(100,200,300);
console.log(masE);


let msj = lista.join("-");
console.log(msj);


let listaNueva = lista.slice(1,3);
console.log(listaNueva);


for (let i = 0; i< lista.lenght; i++){
    console.log(lista[i]);
}
console.log(lista);