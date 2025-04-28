// Function to check if a number is even or odd

function isEvenOrOdd(number) {
  if (typeof number !== 'number') {
    return "Input must be a number.";
  }

  if (number % 2 === 0) {
    return "Even";
  } else {
    return "Odd";
  }
}

// Example usage:
console.log(isEvenOrOdd(4));   // Output: Even
console.log(isEvenOrOdd(7));   // Output: Odd
console.log(isEvenOrOdd("hello")); //Output: Input must be a number.
