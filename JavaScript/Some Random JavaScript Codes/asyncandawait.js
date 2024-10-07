// Function to simulate an asynchronous operation (e.g., fetching data from a server)
function fetchData() {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        // Simulating a successful response after 2 seconds
        resolve("Data fetched successfully!");
      }, 2000);
    });
  }
  
  // Function using async/await to handle asynchronous operation
  async function getData() {
    try {
      console.log("Fetching data...");
      const data = await fetchData(); // Wait until fetchData() promise is resolved
      console.log(data); // Log the fetched data
      console.log("Data processing...");
      // Simulate further processing after data is fetched
      console.log("Data processed successfully!");
    } catch (error) {
      // Handle any errors that may occur during fetching or processing
      console.error("Error:", error);
    }
  }
  
  // Call the getData function
  getData();
  