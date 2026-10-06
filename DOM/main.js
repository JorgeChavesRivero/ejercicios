/* let calabaza = document.getElementById(`seccion1`);
console.log(calabaza);
let pConClase = document.getElementsByClassName(`p1Clase`);
console.log(pConClase);
let p = document.getElementsByTagName(`p`);
console.log(p);
let manzana = document.querySelector(".p1Clase");
console.log(manzana); */

/* let nombre = prompt(`dime tu nombre`);
const h2_nombre = document.querySelector(`#nombre`);
h2_nombre.textContent = `Usuario ${nombre}`; */

let descripcion = prompt(`dime tu nueva descripcion`);
const p1_nuevo = document.querySelector(`#descripcion`);
p1_nuevo.innerHTML = `${descripcion}`;
