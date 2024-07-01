function divide(a, b) {
    try {
        if (b === 0) {
            throw new Error("Division by zero is not allowed.");
        }
        return a / b;
    } catch (e) {
        console.error(e.message);
    } finally {
        console.log("Division attempt completed.");
    }
}

console.log(divide(10, 2));  // Outputs: 5
console.log(divide(10, 0));  // Outputs: Error message and undefined
