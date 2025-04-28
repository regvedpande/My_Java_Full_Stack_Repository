<!DOCTYPE html>
<html>
<head>
<title>DOM Example</title>
</head>
<body>

  <h1 id="main-heading">Hello, DOM!</h1>
  <p class="paragraph">This is the first paragraph.</p>
  <p class="paragraph">This is the second paragraph.</p>
  <button id="change-button">Click Me</button>

  <script>
    // Get the heading element by its ID
    const heading = document.getElementById('main-heading');

    // Get all paragraph elements by their class name
    const paragraphs = document.getElementsByClassName('paragraph');

    // Get the button element by its ID
    const button = document.getElementById('change-button');

    // Add an event listener to the button
    button.addEventListener('click', function() {
      // Change the text content of the heading
      heading.textContent = 'DOM Manipulation Successful!';

      // Loop through all paragraph elements and change their text color
      for (let i = 0; i < paragraphs.length; i++) {
        paragraphs[i].style.color = 'blue';
      }

      // Disable the button after it's clicked
      button.disabled = true;
    });
  </script>

</body>
</html>
