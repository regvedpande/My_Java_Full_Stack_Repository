<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DOM Manipulation Example</title>
</head>
<body>
    <h1>DOM Manipulation Example</h1>
    <p id="myParagraph">This is the original text.</p>
    <button id="myButton">Click me!</button>

    <script>
        // Get references to the elements
        const myButton = document.getElementById('myButton');
        const myParagraph = document.getElementById('myParagraph');

        // Add an event listener to the button
        myButton.addEventListener('click', function() {
            // Change the text content of the paragraph
            myParagraph.textContent = 'The text has been changed!';
        });
    </script>
</body>
</html>