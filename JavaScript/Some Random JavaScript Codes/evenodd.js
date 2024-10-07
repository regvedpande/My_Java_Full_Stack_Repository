// Function to check if a number is even or odd
function checkEvenOrOdd(number) {
    if (number % 2 === 0) {
      return `${number} is even.`;
    } else {
      return `${number} is odd.`;
    }
  }
  
  // Test the function
  console.log(checkEvenOrOdd(7)); // Output: 7 is odd.
  console.log(checkEvenOrOdd(12)); // Output: 12 is even.
  