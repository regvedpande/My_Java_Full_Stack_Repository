// Example 1: Expanding an array
const numbers = [1, 2, 3];
const newNumbers = [...numbers, 4, 5];
console.log(newNumbers); // Output: [1, 2, 3, 4, 5]

// Example 2: Combining arrays
const arr1 = [10, 20];
const arr2 = [30, 40];
const combinedArray = [...arr1, ...arr2];
console.log(combinedArray); // Output: [10, 20, 30, 40]

// Example 3: Passing array elements as individual arguments to a function
function sum(a, b, c) {
  return a + b + c;
}
const values = [5, 10, 15];
const result = sum(...values);
console.log(result); // Output: 30

// Example 4: Creating a copy of an array
const originalArray = [true, false, true];
const copiedArray = [...originalArray];
copiedArray[0] = false; // Modifying the copy doesn't affect the original
console.log(originalArray); // Output: [true, false, true]
console.log(copiedArray);  // Output: [false, false, true]

// Example 5: Expanding a string into individual characters
const greeting = "Hello";
const letters = [...greeting];
console.log(letters); // Output: ["H", "e", "l", "l", "o"]

// Example 6: Expanding an object (shallow copy)
const person = { name: "Alice", age: 30 };
const newPerson = { ...person, city: "New York" };
console.log(newPerson); // Output: { name: "Alice", age: 30, city: "New York" }
