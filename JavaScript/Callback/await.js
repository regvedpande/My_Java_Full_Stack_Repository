// Example of an async function
async function fetchData() {
  try {
    // Simulating an API call with fetch (works in browsers or with Node.js and 'node-fetch' library)
    const response = await fetch("https://jsonplaceholder.typicode.com/posts");
    
    // Await the JSON parsing of the response
    const data = await response.json();
    
    // Log the fetched data
    console.log("Fetched Data:", data);
  } catch (error) {
    // Handle errors
    console.error("Error fetching data:", error);
  }
}

// Call the async function
fetchData();