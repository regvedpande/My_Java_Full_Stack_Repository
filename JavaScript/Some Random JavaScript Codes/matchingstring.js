// let input1 = parseInt(prompt('Enter First Number'));
// let input2 = parseInt(prompt('Enter Second Number'));
// if (input1==input2) {
//     alert("Your Numbers Matched");
// } else {
//     console.log("Enter your Numbers Again")
// }

let sentence = "Kang the Conqueror variants are Victor Timely, He Who Remains";
let search = prompt("Which word you want to check");
let iterator = sentence.includes(search);

if (iterator) {
    console.log("Your word is matching");
} else {
    console.log("Your word is not matching");
}
