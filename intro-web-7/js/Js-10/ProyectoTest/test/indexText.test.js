//prueba efectiva
const indexTest = require ("../calculadora");
test('test suma', () => {
  const r = indexTest.suma(3,2);
  expect (r).toBe(5);

});