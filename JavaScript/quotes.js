const quotes = [
    "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart. - Helen Keller",
    "If you can dream it, you can do it. - Walt Disney",
    "The only way to do great work is to love what you do. - Steve Jobs"
  ];
  
  function getRandomQuote() {
    const randomIndex = Math.floor(Math.random() * quotes.length);
    return quotes[randomIndex];
  }
  
  console.log(getRandomQuote());
  