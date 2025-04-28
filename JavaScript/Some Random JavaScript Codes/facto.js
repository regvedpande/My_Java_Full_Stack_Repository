// A simple JavaScript function to calculate the factorial of a number.

function factorial(n) {
  if (n < 0) {
    return "Factorial is not defined for negative numbers";
  } else if (n === 0) {
    return 1;
  } else {
    let result = 1;
    for (let i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}

// Example usage:
const num = 5;
const result = factorial(num);
console.log(`The factorial of ${num} is ${result}`); // Output: The factorial of 5 is 120

const negNum = -3;
const negResult = factorial(negNum);
console.log(negResult); // Output: Factorial is not defined for negative numbers

const zeroNum = 0;
const zeroResult = factorial(zeroNum);
console.log(`The factorial of ${zeroNum} is ${zeroResult}`); //output: The factorial of 0 is 1
