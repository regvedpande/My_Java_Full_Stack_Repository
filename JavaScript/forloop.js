// for (let index = 0; index < 20; index++) {
//     console.log(index)
// }


// //If you have to print till the limit you can use i + 1
// for (let index = 0; index < 20; index++) {
//     console.log(index + 1)    
// }

//Program to add First n Natural Numbers
let sum = 0;
let total = 10;
for (let index = 0; index < total; index++) {
    sum += (index + 1); 
}
console.log(sum)
//or
console.log("Sum of first" + total + "Natural Numbers is " + sum)
// console.log(index) will show error as let is block level if you replace
// it with var it will run as var is global scope