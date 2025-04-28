function fetchData(url, callback) {
  // Simulate fetching data asynchronously
  setTimeout(() => {
    const data = {
      url: url,
      result: `Data from ${url}`
    };
    callback(null, data); // Simulate successful data fetch
    // If there was an error, you would call callback(error, null);
  }, Math.random() * 1000); // Random delay to simulate network latency

}

function processData(error, data) {
  if (error) {
    console.error("Error fetching data:", error);
    return;
  }
  console.log("Data received:", data);
  console.log("Processing data...");
  console.log("Processed result:", data.result.toUpperCase());
}

fetchData("https://example.com/api/data", processData);

console.log("Fetching data..."); // This will likely execute before processData
