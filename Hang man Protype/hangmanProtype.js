// List of words for the game
const words = ['hangman', 'javascript', 'programming', 'openai', 'computer'];

// Select a random word from the list
const randomIndex = Math.floor(Math.random() * words.length);
const selectedWord = words[randomIndex];

// Array to store the guessed letters
const guessedLetters = [];

// Maximum number of allowed guesses
const maxGuesses = 6;

// Man stages for hanging
const manStages = [
  `
    +---+
    |   |
        |
        |
        |
        |
  =========
  `,
  `
    +---+
    |   |
    O   |
        |
        |
        |
  =========
  `,
  `
    +---+
    |   |
    O   |
    |   |
        |
        |
  =========
  `,
  `
    +---+
    |   |
    O   |
   /|   |
        |
        |
  =========
  `,
  `
    +---+
    |   |
    O   |
   /|\  |
        |
        |
  =========
  `,
  `
    +---+
    |   |
    O   |
   /|\  |
   /    |
        |
  =========
  `,
  `
    +---+
    |   |
    O   |
   /|\  |
   / \  |
        |
  =========
  `
];

// Function to display the current state of the word
function displayWordState() {
  let wordState = '';
  for (let char of selectedWord) {
    if (guessedLetters.includes(char)) {
      wordState += char;
    } else {
      wordState += '_';
    }
    wordState += ' ';
  }
  console.log(wordState);
}

// Function to check if the game is won
function isGameWon() {
  for (let char of selectedWord) {
    if (!guessedLetters.includes(char)) {
      return false;
    }
  }
  return true;
}

// Function to process a guessed letter
function processGuess(letter) {
  if (guessedLetters.includes(letter)) {
    console.log("You already guessed that letter. Try again!");
  } else {
    guessedLetters.push(letter);
    if (selectedWord.includes(letter)) {
      console.log("Good guess!");
      if (isGameWon()) {
        console.log("Congratulations! You won the game!");
      }
    } else {
      console.log("Oops! Wrong guess.");
      console.log("Remaining guesses: " + (maxGuesses - guessedLetters.length));
      if (guessedLetters.length >= maxGuesses) {
        console.log("You lost the game. The word was: " + selectedWord);
      } else {
        console.log(manStages[guessedLetters.length]);
      }
    }
  }
}

// Function to start the game
function startGame() {
  console.log("Welcome to Hangman!");
  console.log("Guess the word by entering one letter at a time.");
  console.log("You have " + maxGuesses + " guesses. Good luck!");
  displayWordState();
}

// Read the user's input and process the guess
function readUserInput() {
  const guess = prompt("Enter your guess: ");
  const letter = guess.trim().toLowerCase();
  processGuess(letter);
  displayWordState();

  // Check if the game is won or lost
  if (isGameWon() || guessedLetters.length >= maxGuesses) {
    return;
  } else {
    readUserInput();
  }
}

// Start the game
startGame();

// Call the function to read user input
readUserInput();