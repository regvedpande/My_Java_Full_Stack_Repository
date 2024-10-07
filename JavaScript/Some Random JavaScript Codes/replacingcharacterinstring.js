// let sentence1 = "Iron Man is the lead Avenger of the Marvel";

// let one = prompt("Enter the Text to replace");
// let two = prompt("Enter the text that to want to add in place of that");

// let word1 = sentence1.replace(one,two);

// alert(word1);

let sen = prompt("Enter your Word here");

let word = prompt("Enter the position that you want to replace the character from");
let store = parseInt(word);

let text = prompt("Enter the character that you want to replace");
let save = text;

let newtext = sen.replace(sen[store], save.charAt());
console.log(newtext);