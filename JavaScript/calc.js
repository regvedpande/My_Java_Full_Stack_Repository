// Define an array of numbers
const numbers = [5, 10, 15, 20, 25];

// Function to calculate the sum of numbers in the array
function calculateSum(arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

// Calculate the sum of numbers in the array
const sum = calculateSum(numbers);

// Output the result
console.log("The sum of numbers is:", sum);
