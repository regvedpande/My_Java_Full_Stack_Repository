// Create a new paragraph element
const newParagraph = document.createElement("p");

// Set the text content of the paragraph
newParagraph.textContent = "This is a dynamically added paragraph.";

// Append the paragraph to the body of the document
document.body.appendChild(newParagraph);

//Change the color of the text.
newParagraph.style.color = "blue";
