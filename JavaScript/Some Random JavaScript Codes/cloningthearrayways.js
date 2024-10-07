// let arrayclone = function(num){
//     return num.slice(0); //To create shallow copy of an Array
// }

// console.log(arrayclone([1,2,5,8]));
// console.log(arrayclone([1,[2,5],8]));

//ES6 Version of it
// let arrayclone = num => {
//     return num.slice(0); //To create shallow copy of an Array
// }

// console.log(arrayclone([1,2,5,8]));
// console.log(arrayclone([1,[2,5],8]));


//Using (...) Spread Operator
// let x = [23,56,98,74,38];
// let y = [...x];
// console.log("Shallow copy of your Array is : ", y);

//Using Array.from()
/*Array.from() has a very powerful API that can be used for many
different things, including creating a copy of an array.*/
// let a = [12,56,90,67,85];
// let b = Array.from(a);
// console.log(b);

// Similarly to the spread operator, 
//Array.prototype.slice() can be used to create a shallow copy of an array.
// let c = [1,9,8,7,0,5];
// let d = c.slice();
// console.log(d);

//You can also use Map
// let r = [9,6,5,82];
// let f = r.map(i => i);
// console.log(f);

// Array.prototype.filter() can be used to return true for each and every element,
//resulting in a new array with all of the original array's elements.
let k = [34,87,45,10];
let m = k.filter(() => true);
console.log(m);
