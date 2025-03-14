// Basic array destructuring
const numbers = [1, 2, 3];
const [first, second, third] = numbers;

console.log(first);  // Output: 1
console.log(second); // Output: 2
console.log(third);  // Output: 3

// Skipping elements
const [a, , c] = numbers; // Skip the second element

console.log(a); // Output: 1
console.log(c); // Output: 3

// Rest parameter (collecting remaining elements)
const [head, ...tail] = numbers;

console.log(head);  // Output: 1
console.log(tail);  // Output: [2, 3]

// Default values
const [x, y, z, fourth = 4] = numbers;

console.log(x);      // Output: 1
console.log(y);      // Output: 2
console.log(z);      // Output: 3
console.log(fourth); // Output: 4

const [p = 'default1', q = 'default2', r = 'default3', s = 'default4'] = [10,20];

console.log(p); // 10
console.log(q); // 20
console.log(r); // default3
console.log(s); // default4

// Destructuring with functions
function getCoordinates() {
  return [10, 20];
}

const [latitude, longitude] = getCoordinates();

console.log(latitude);  // Output: 10
console.log(longitude); // Output: 20

// Nested array destructuring
const nested = [1, 2, [3, 4]];
const [i, j, [k, l]] = nested;

console.log(i); // Output: 1
console.log(j); // Output: 2
console.log(k); // Output: 3
console.log(l); // Output: 4

//Swapping variables
let m = 1;
let n = 2;

[m, n] = [n, m];

console.log(m); //2
console.log(n); //1

//Destructuring array returned from a function that returns an object.
function returnArrayFromObject(){
    return {myArray:[1,2,3]}
}

const {myArray: [d,e,f]} = returnArrayFromObject();

console.log(d); // 1
console.log(e); // 2
console.log(f); // 3

//Destructuring array returned directly from a function.
function returnArray(){
  return [1,2,3];
}
const [g,h,i] = returnArray();

console.log(g); //1
console.log(h); //2
console.log(i); //3
