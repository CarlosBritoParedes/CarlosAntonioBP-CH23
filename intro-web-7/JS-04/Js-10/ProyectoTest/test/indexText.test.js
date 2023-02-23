/* Prueba efectiva */
//const indexTest = require("../calculadora")  //dirigirse al objeto de prueba ECMA5

/* inicia la prueba  */
import { indexTest } from "../calculadora"; //dirigirse al objeto de prueba ECMA6
test ('test suma', () => {
    const r = indexTest.suma(3,2);
    expect(r).toBe(5);
})
test.todo('test resta'); //Prueba en espera 
test.todo('test multi'); //Prueba en espera
test.todo('test div'); //Prueba en espera