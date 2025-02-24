// Using the Spread Operator with arrays

// Original array
const originalArray = [1, 2, 3, 4];

// New array created using the Spread Operator
const newArray = [...originalArray, 5, 6, 7];

// Output the new array
console.log(newArray);
// Output: [1, 2, 3, 4, 5, 6, 7]

// Copying and concatenating arrays
const array1 = [8, 9, 10];
const array2 = [11, 12, 13];
const combinedArray = [...array1, ...array2];

// Output the combined array
console.log(combinedArray);
// Output: [8, 9, 10, 11, 12, 13]