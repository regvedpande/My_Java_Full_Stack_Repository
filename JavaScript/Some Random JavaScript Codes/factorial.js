function factorial(n) {
    if (n === 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

let result = factorial(5);
console.log("Factorial of 5: ", result); 
