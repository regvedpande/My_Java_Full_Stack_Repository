// Function returning a promise that resolves after a given time
function delay(ms) {
    return new Promise(resolve => {
        setTimeout(resolve, ms);
    });
}

// Function using async/await to perform asynchronous operations sequentially
async function sequentialAsyncOperations() {
    try {
        console.log("Operation 1: Start");
        await delay(2000); // Simulating an asynchronous operation
        console.log("Operation 1: Completed");

        console.log("Operation 2: Start");
        await delay(1000); // Simulating another asynchronous operation
        console.log("Operation 2: Completed");
    } catch (error) {
        console.error("Error occurred:", error);
    }
}

// Calling the function that uses async/await
sequentialAsyncOperations();
