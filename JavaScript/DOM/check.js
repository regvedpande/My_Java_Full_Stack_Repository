<!DOCTYPE html>
<html>
<head>
<title>DOM Example</title>
</head>
<body>

  <h1 id="main-heading">Hello, DOM!</h1>
  <p class="paragraph">This is the first paragraph.</p>
  <p class="paragraph">Here is another paragraph.</p>
  <button id="myButton">Click Me</button>
  <ul id="myList">
    <li class="listItem">Item 1</li>
    <li class="listItem">Item 2</li>
  </ul>

  <script>
    // Get the heading element by its ID
    const heading = document.getElementById('main-heading');

    // Change the text content of the heading
    heading.textContent = 'Updated Heading!';

    // Get all paragraph elements by their class name
    const paragraphs = document.getElementsByClassName('paragraph');

    // Loop through the paragraphs and change their text content
    for (let i = 0; i < paragraphs.length; i++) {
      paragraphs[i].textContent = `Paragraph ${i + 1} is now modified.`;
    }

    // Get the button element by its ID
    const button = document.getElementById('myButton');

    // Add an event listener to the button
    button.addEventListener('click', function() {
      alert('Button Clicked!');
    });

    // Get the unordered list element by its ID
    const list = document.getElementById('myList');

    // Create a new list item element
    const newItem = document.createElement('li');
    newItem.textContent = 'New Item Added';
    newItem.classList.add('listItem'); // Add the listItem class to the new item

    // Append the new list item to the end of the list
    list.appendChild(newItem);
  </script>

</body>
</html>
