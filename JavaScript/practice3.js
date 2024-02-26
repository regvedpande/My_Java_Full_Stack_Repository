/* Program to print marks of a student in an object using for Loop */
let marks = {
    regved: "98",
    ayush: "94",
    sarvesh: "92",
}

//Using `for` Loop: Iterates over the keys of the `marks` object and prints each key-value pair.
// Using for Loop
for (let index = 0; index < Object.keys(marks).length; index++) {
    console.log(Object.keys(marks)[index] + ": " + marks[Object.keys(marks)[index]]);
}

//Using `for in` Loop: Iterates through the keys of the `marks` object and prints each key-value pair.
// Using for in Loop
for (let key in marks) {
    console.log(key + ": " + marks[key]);
}