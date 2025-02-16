// Create a new div element
let newDiv = document.createElement("div");

// Set some attributes and styles
newDiv.id = "uniqueID";
newDiv.className = "fancyDiv";
newDiv.style.backgroundColor = "#f0f0f0";
newDiv.style.padding = "20px";
newDiv.style.margin = "10px";
newDiv.style.borderRadius = "10px";

// Create a new text node
let newContent = document.createTextNode("Hello, I'm a new div element!");

// Add the text node to the div
newDiv.appendChild(newContent);

// Append the new div to the body
document.body.appendChild(newDiv);