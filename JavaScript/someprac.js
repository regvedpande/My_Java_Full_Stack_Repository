// Array of quotes
const quotes = [
    "The best way to predict the future is to create it. - Abraham Lincoln",
    "The only person you are destined to become is the person you decide to be. - Ralph Waldo Emerson",
    "Two roads diverged in a yellow wood, And I - I took the one less traveled by, And that has made all the difference. - Robert Frost"
  ];
  
  // Get a random index from the quotes array
  const randomIndex = Math.floor(Math.random() * quotes.length);
  
  // Get the random quote
  const randomQuote = quotes[randomIndex];
  
  // Display the quote in an alert box
  alert(randomQuote);
  