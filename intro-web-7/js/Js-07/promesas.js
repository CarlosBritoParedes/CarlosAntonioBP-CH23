const myURL = document.url.toString();
const promesa = fetch(myUrl);
promesa.then(resultado=> console.resultado), e => console.log(`error callback ${e}`);