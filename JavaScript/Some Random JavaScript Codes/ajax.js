function fetchData() {
  const xhr = new XMLHttpRequest();
  const url = 'https://api.example.com/data'; // Replace with your API endpoint

  xhr.open('GET', url);

  xhr.onload = function() {
    if (xhr.status >= 200 && xhr.status < 300) {
      // Request was successful
      console.log('Data received:', xhr.responseText);
      // Process the response data here (e.g., update the UI)
    } else {
      // Request failed
      console.error('Request failed. Returned status of ' + xhr.status);
    }
  };

  xhr.onerror = function() {
    // There was a network error
    console.error('There was a network error.');
  };

  xhr.send();
}

// Call the function to initiate the AJAX request
fetchData();
