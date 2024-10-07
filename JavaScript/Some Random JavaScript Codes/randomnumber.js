// Function to generate a random number between a specified range
function getRandomNumber(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
  }
  
  // Example usage: Generate a random number between 1 and 100
  const randomNumber = getRandomNumber(1, 100);
  console.log("Random Number:", randomNumber);
  