let word = "I am Loki the God of the Multiverse";
let input = prompt("Do you want to extract the Substring");
let store = input;
if (store == "yes") {
    console.log("You can now proceed forward");
} else {
    console.log("Retry");
}
let from = parseInt(prompt("From Where: "))
let end = parseInt(prompt("To:"))
let result = input.substring(from,end);
console.log(result);