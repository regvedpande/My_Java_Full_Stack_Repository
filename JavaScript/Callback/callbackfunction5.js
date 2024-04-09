// let regved = (a, b, total) => {
//     return total(a, b);
// }

// let ayush = (c, d, callin) => {
//    let sum1 = c;
//    let sum2 = d;
//    return callin(sum1, sum2);
// }

// console.log(ayush(5, 3, regved));

let regved = (a, b) => {
    return a + b;
}

let ayush = (c, d, callin) => {
   let sum1 = c;
   let sum2 = d;
   return callin(sum1, sum2);
}

console.log(ayush(5, 3, regved));

//For the Substraction

let subst = (x, y) => x - y;

let subs = ayush(4, 9, subst);
console.log(subs);