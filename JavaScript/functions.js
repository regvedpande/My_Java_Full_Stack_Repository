
/*JavaScript Functions is a block of code that is designed to perform a particular task here 
in the code "addtwonumbers" and "sum" are functions here */
function addtwonumbers(x, y){
    return (x * y) /2 ;
    //If you want to remove decimal points you can also use Math.round (x * y) /2 with return
}

const sum =(a, b)=>{
    let c =  a + b;
    return c;
}

let a = 4;
let b = 8;
let c = 9;
/*Function invocation in JavaScript is the process of executing (or running) the code contained within
    a defined function. You invoke a function by writing its name followed by parentheses, which may contain
    optional arguments (values) for the function to use.*/
// Call the 'sum' function with arguments 2 and 3
let y = sum(2,3)

console.log(y)

// Call the 'addtwonumbers' function with arguments 'a' and 'b'
console.log("Average of a and b is : " +addtwonumbers(a,b))
console.log("Average of b and c is : " +addtwonumbers(b,c))
console.log("Average of a and c is : " +addtwonumbers(a,c))