function flipCoin() {
    const randomValue = Math.random();
    return randomValue > 0.5 ? "Heads" : "Tails";
  }
  
  console.log("Flipping a coin...");
  console.log(flipCoin());
  