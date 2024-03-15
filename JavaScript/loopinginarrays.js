// let a = [2,5,6,8,9];
// let input = prompt("Enter the Arrays that you want to insert");
// console.log(a.push(input));
// console.log(a)

// let a = [];

// if (input==0) {
//     alert("You terminated your operation");
// } else {
//         while (input != 0) {
//         let input = prompt("Enter the Arrays that you want to insert : ");
//         a.push(input);
// }

// }
// console.log(a);


let b = [];
let size = parseInt(prompt("Enter the size of your Array"));

for (let index = 0; index < size; index++) {
    let input = prompt(`Enter you ${index + 1} Array`);
    b.push(input);
}
console.log("Your Arrays are : ", b);


let item = n-1;
let operation = b.reduce( n,item => {
    return  n * n-1;
});

console.log(operation)

