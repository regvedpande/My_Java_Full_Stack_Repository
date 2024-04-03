/*It begins by obtaining references to various HTML elements used in the game, such as input
  fields, scoreboard, buttons, and the grid container.*/
const playerNameInput = document.getElementById('playerName'); // Input field for player name
const scoreboard = document.getElementById('scoreboard'); // Scoreboard
const submitNameButton = document.getElementById('submitName'); // Button to submit player name
const minutesSpan = document.getElementById('minutes'); // Display area for remaining minutes
const secondsSpan = document.getElementById('seconds'); // Display area for remaining seconds
const gridContainer = document.querySelector('.grid'); // Container for the grid cells
const resetButton = document.getElementById('resetButton'); // Button to reset the game

/*Global variables are initialized to store players, the current player index, remaining time,
  random numbers, and game status flags.*/

let players = []; // Array to store players
let currentPlayerIndex = 0; // Index of the current player
let remainingTime = 300; // Remaining time in seconds (5 minutes)
let numbers = []; // Array to store random numbers
let currentIndex = 0; // Index to keep track of the current number being clicked
let timerInterval; // Variable to hold the timer interval
let gameOver = false; // Flag to track if the game is over

/* The createGrid() function generates random numbers and creates grid cells with event
  listeners for each number.*/

function createGrid() {
  numbers = generateRandomNumbers(100); // Generate 100 unique random numbers
  gridContainer.innerHTML = ''; // Clear previous grid
  
  for (let i = 0; i < 100; i++) {
    const cell = document.createElement('div'); // Create a new div element for a grid cell
    cell.classList.add('cell'); // Add 'cell' class to the div
    cell.textContent = numbers[i]; // Set the cell content to a random number
    cell.addEventListener('click', handleCellClick); // Add click event listener
    gridContainer.appendChild(cell); // Append the cell to the grid container
  }
}

/* The generateRandomNumbers() function creates an array of unique random numbers using a Set.
  It ensures that each number in the array is unique.*/

function generateRandomNumbers(max) {
  const set = new Set(); // Create a Set to store unique numbers
  while (set.size < max) {
    set.add(Math.floor(Math.random() * max) + 1); // Add a random number to the Set
  }
  return Array.from(set); // Convert Set to Array and return
}

/*The handleCellClick() function is invoked when a player clicks on a cell. It checks 
  if the clicked number is correct, updates the UI accordingly, and manages the game's progression.
  If the clicked number is incorrect, it switches to the next player and resets the game. */

function handleCellClick(event) {
  if (gameOver) return; // If the game is over, do nothing
  
  const cell = event.target; // Get the clicked cell
  const number = parseInt(cell.textContent); // Parse the number from the cell content

  // Check if the clicked number is correct
  if (number === currentIndex + 1) {
    cell.classList.add('correct'); // Mark the cell as correct
    cell.textContent = ''; // Remove the number from the cell
    currentIndex++; // Increment the index of the current number

    // Award point to the current player
    awardPoint(); // Award point to the current player

    // Check if all numbers are clicked in order
    if (currentIndex === 100) {
      gameOver = true; // Set game over flag
      clearInterval(timerInterval); // Clear the timer interval
      const winner = determineWinner(); // Determine the winner
      congratulationMessage.textContent = `Congratulations, ${winner.name}! You won the game!`; // Display congratulation message
    }

  } else {
    cell.classList.add('incorrect'); // Mark the cell as incorrect

    // Switch to the next player
    switchPlayer(); // Switch to the next player

    // Reset the game for the current player
    resetGame(); // Reset the game
  }
}

/*Functions like awardPoint(), switchPlayer(), and updateScoreboard() handle scoring, player switching, and 
      updating the scoreboard UI respectively. */

function awardPoint() {
  const currentPlayer = players[currentPlayerIndex]; // Get the current player
  currentPlayer.score++; // Increment the score of the current player
  updateScoreboard(); // Update the scoreboard
}

// Function to switch to the next player
function switchPlayer() {
  currentPlayerIndex = (currentPlayerIndex + 1) % players.length; // Move to the next player
  clearInterval(timerInterval); // Clear the timer interval for the current player
}

// Function to update the scoreboard
function updateScoreboard() {
  scoreboard.innerHTML = ''; // Clear previous scoreboard
  players.forEach(player => {
    const playerScore = document.createElement('div'); // Create a div for player's score
    playerScore.textContent = `${player.name}: ${player.score}`; // Set player's name and score
    scoreboard.appendChild(playerScore); // Append player's score to the scoreboard
  });
}

/*The resetGame() function resets the game state, clears the grid, and starts the timer for the next player. 
  The startTimer() function initializes and starts the countdown timer. */

function resetGame() {
  currentIndex = 0; // Reset the index of the current number
  clearInterval(timerInterval); // Clear the timer interval
  createGrid(); // Recreate the grid
  startTimer(); // Start the timer for the next player
}

// Function to start the timer
function startTimer() {
  remainingTime = 300; // Reset remaining time to 5 minutes
  clearInterval(timerInterval); // Clear existing interval to prevent multiple timers
  
  // Set interval to update remaining time every second
  timerInterval = setInterval(() => {
    remainingTime--; // Decrement remaining time
    const minutes = Math.floor(remainingTime / 60); // Calculate remaining minutes
    const seconds = remainingTime % 60; // Calculate remaining seconds

    // Update timer display
    minutesSpan.textContent = String(minutes).padStart(2, '0'); // Pad minutes with leading zero if necessary
    secondsSpan.textContent = String(seconds).padStart(2, '0'); // Pad seconds with leading zero if necessary

    // Check if time is over
    if (remainingTime <= 0) {
      clearInterval(timerInterval); // Stop the timer interval
      alert('Time Over! Game Reset'); // Show time over message
      resetGame(); // Reset the game
    }
  }, 1000); // Update every second (1000 milliseconds)
}

/*The determineWinner() function identifies the player with the highest score and declares them the winner. */
function determineWinner() {
  var winner = players[0]; // Assume the first player is the winner

  // Loop through the players
  for (let i = 1; i <= players.length; i++) {
    // If the current player's score is greater than the winner's score
    if (players[i].score > winner.score) {
      winner = players[i]; // Update the winner
    }
  }

  return winner; // Return the winner
}

/*Event listeners are attached to buttons for submitting player names and resetting the game. These listeners 
    trigger actions such as adding players, updating the scoreboard, and starting the game. */

submitNameButton.addEventListener('click', () => {
  const playerName = playerNameInput.value || 'Player'; // Get player name from input or set default
  players.push({ name: playerName, score: 0 }); // Add player to the players array
  updateScoreboard(); // Update the scoreboard
  startTimer(); // Start the timer for the first player
});

// Event listener for reset button
resetButton.addEventListener('click', () => {
  gameOver = false; // Reset game over flag
  clearInterval(timerInterval); // Clear the timer interval
  players = []; // Clear players array
  currentPlayerIndex = 0; // Reset current player index
  updateScoreboard(); // Update the scoreboard
  resetGame(); // Reset the game
});

// Get reference to the winnerMessage div
const winnerMessage = document.getElementById('winnerMessage');

// Update the winnerMessage text content when the game is over
if (currentIndex === 100) {
  gameOver = true; // Set game over flag
  clearInterval(timerInterval); // Clear the timer interval
  const winner = determineWinner(); // Determine the winner
  winnerMessage.textContent = `Congratulations, ${winner.name}! You won the game!`; // Display congratulation message
}


/*Finally, the game initializes by calling the createGrid() function to set up the initial game board. */
createGrid(); // Create initial grid
