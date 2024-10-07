let arr = [1,2,3,4,5];
// val , idx and arr are predefined and given by JavaScript
// arr.forEach((val, idx, arr) => {
//     console.log(val, idx, arr);
// });

// Using Arrow Function
// let getme = (getval) => {
//     console.log(getval * getval);
// }

// arr.forEach(getme);


// Using Map Function which stores mthe value to array into another array 
// let newvalue = arr.map((val) => {
//     return val;
// });
// console.log(newvalue);

//Use of the Filter Method
// let anothernewvalue = arr.filter((val) =>{
//     return val % 2 === 0;
// });

// console.log(anothernewvalue);


//Use of the Reduce Method
// let gets = arr.reduce((a, b) => {
//     // return a + b;
//     return a > b ? a : b;
// });

// console.log(gets);

//Some problem Statement
let store = prompt("Enter the Number");
let arry = [];

for(let i=1; i <= store; i++){
    arry[i-1] = i;
}

let store2 = arr.reduce((a,b) =>{
    return a + b;
})

console.log(store2);