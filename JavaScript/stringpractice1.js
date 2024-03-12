let word = prompt("You can enter your Sentence here");
console.log("Your Entered word is: ", word);

let remove = prompt("Enter the word you want to replace: ");
let add = prompt("Enter the replacement word: ");

let output = word.replace(remove, add);
console.log("Your Replaced word is: ", output);

let search = prompt("Do you wish to know the index of any word in you sentence");
console.log("Index of your word is : ", word.indexOf(search));