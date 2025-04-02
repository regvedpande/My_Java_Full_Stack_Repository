<!DOCTYPE html>
<html>
<head>
  <title>DOM Example</title>
</head>
<body>

  <h1 id="myHeading">Original Heading</h1>
  <p id="myParagraph">This is a paragraph.</p>
  <button id="myButton">Change Text</button>

  <script>
    // Get references to the DOM elements
    const heading = document.getElementById("myHeading");
    const paragraph = document.getElementById("myParagraph");
    const button = document.getElementById("myButton");

    // Add an event listener to the button
    button.addEventListener("click", function() {
      // Change the heading text
      heading.textContent = "Heading Changed!";

      // Change the paragraph text and style
      paragraph.textContent = "Paragraph text has also been changed, and the color is now blue.";
      paragraph.style.color = "blue";
    });

  </script>

</body>
</html>
