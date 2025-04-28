<!DOCTYPE html>
<html>
<head>
<title>DOM Manipulation Example</title>
</head>
<body>

  <h1 id="main-heading">Hello, DOM!</h1>
  <p class="paragraph">This is the first paragraph.</p>
  <p class="paragraph">This is the second paragraph.</p>
  <ul id="item-list">
    <li class="list-item">Item 1</li>
    <li class="list-item">Item 2</li>
    <li class="list-item">Item 3</li>
  </ul>
  <button id="add-button">Add New Item</button>

  <script>
    // Get elements by their ID
    const mainHeading = document.getElementById('main-heading');
    const itemList = document.getElementById('item-list');
    const addButton = document.getElementById('add-button');

    // Get elements by their class name
    const paragraphs = document.getElementsByClassName('paragraph');
    const listItems = document.getElementsByClassName('list-item');

    // Get the first paragraph using querySelector
    const firstParagraph = document.querySelector('.paragraph');

    // Get all list items using querySelectorAll
    const allListItems = document.querySelectorAll('#item-list .list-item');

    // Modify text content
    mainHeading.textContent = 'DOM Manipulation in Action!';

    // Modify CSS style
    firstParagraph.style.color = 'blue';

    // Loop through paragraphs and change their text
    for (let i = 0; i < paragraphs.length; i++) {
      paragraphs[i].textContent = `Paragraph number ${i + 1} (modified)`;
    }

    // Add a new list item
    addButton.addEventListener('click', () => {
      const newListItem = document.createElement('li');
      newListItem.textContent = 'New Item Added!';
      newListItem.classList.add('list-item'); // Add the list-item class
      itemList.appendChild(newListItem);
    });

    // Remove the first list item
    if (itemList.firstChild) {
      // Note: childNodes includes text nodes, element nodes, etc.
      // firstElementChild specifically gets the first element node.
      itemList.removeChild(itemList.firstElementChild);
    }

    // Event listener for all list items (example of event delegation)
    itemList.addEventListener('click', (event) => {
      if (event.target.classList.contains('list-item')) {
        console.log(`You clicked on: ${event.target.textContent}`);
      }
    });
  </script>

</body>
</html>
