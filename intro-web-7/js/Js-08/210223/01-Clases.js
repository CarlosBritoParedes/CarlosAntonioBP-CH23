class Persona {

    constructor (nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }

    get nombre() {
        return this._nombre;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }
    get apellido() {
        return this._apellido
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }

}

class Empleado extends Persona {
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido);
        this._departamento = departamento;
    }
    set departamento(departamento) {
        this._departamento=departamento;
    }
    get departamento(){
        return this._departamento;
    }
}

let persona1 = new Persona("Arturo", "Chavez");
console.log(persona1.nombreCompleto());


let empleado1 = new Empleado('Maria', 'Perez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

// let persona3 = new Persona('Jhonny', 'Deep');
// persona3.nombre = 'Juan';
// console.log(persona3.nombre);

// persona3.apellido = 'Jimenez';
// console.log(persona3.apellido);

// let persona1 = new Persona("Juan", "Perez");
// console.log(persona1.nombre);
// console.log(persona1.apellido);
// let persona2 = new Persona("Maria", "Jimenez");
// console.log(persona2);