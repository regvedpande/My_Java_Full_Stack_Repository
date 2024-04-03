//A callback is a function passed as an argument to another function.
let one = (some) =>{
    console.log(some);
}

let two = (a,b, callin) =>{
    let total = a * b;
    callin(total);
}

two(1, 2, one);