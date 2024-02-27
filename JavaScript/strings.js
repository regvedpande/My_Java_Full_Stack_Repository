let a = "Regved";
let b = "Prathmesh";
//Note you can use String Literal in Single Quote and the Double Quote but not Hybrid

//Templates uses backticks insead of double/single quotes
//With backticks you can use Single or Double Quotes inside it is also called String Interpolation
let print = `"${a}" is a Friend of "${b}" `;
console.log(print)

//What if we have to use String Inside String
//Escape Sequences
let fruit = 'Bana\'na'
console.log(fruit)
console.log(fruit.length) //also consider \ as a 1