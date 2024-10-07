/*Use Logical Operator to find whether the age of the person lies 
    between the age of 18 and 20*/
let age  = 19;

if (age > 18 && age <20) {
    console.log("Age of the Person lies between the ages of 18 and 20")
} else {
    console.log("Age of the Person is less than 18 or more than 20")
}

//  Use of Switch Case Statement in Javascript
console.log("Switch Case Concepts")
let price  = 2000;
switch (price) {
    case 3000:
        console.log("Price of the Item is 3000")
        break;
    case 4000:
        console.log("Price of the Item is 4000")
        break;
    case 2000:
        console.log("Price of the Item is 2000")
        break;
    default:
        break;
}

//JavaScript Program to check whether the number is divisible by 2 or 3
let num  = 45;
if (num % 2 == 0) {
    console.log("The Number is Divisible by 2")
} else if (num % 3 == 0) {
    console.log("The Number is Divisible by 3")
} else{
    console.log("The Number is not divisible by either of them")
}

//Ternary Operator Question
let regvedage = 25;
console.log((regvedage > 18)? "Regved can Drive" : "Regved cannot Drive")