function flipCoin() {
    const randomValue = Math.random(); // Generate random number between 0 and 1
    const isHeads = randomValue < 0.5; // Check if less than 0.5 for heads
  
    if (isHeads) {
      console.log("Heads");
    } else {
      console.log("Tails");
    }
  }
  
  flipCoin(); // Call the function to flip the coin
  