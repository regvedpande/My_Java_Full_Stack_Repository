let num = [1, 2, 3, 4, 5];

// Print the data type of the 'num' array using the typeof operator.
console.log(typeof num);

// Print the length of the 'num' array using the length property.
console.log(num.length);

// Print the string representation of the 'num' array.
console.log(num.toString());

// Attempt to access the element at index 2 of the 'num' array using the at method.
console.log(num.at(2));

// The pop() method removes the last element from an array:
console.log(num.pop())

// The push() method adds a new element to an array (at the end):
console.log(num.push("8"))

for (const iterator of num) {
    console.log(iterator);
}