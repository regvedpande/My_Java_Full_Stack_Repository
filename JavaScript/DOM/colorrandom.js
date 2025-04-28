<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Random Color Generator</title>
</head>
<body>
    <h1>Click the button to generate a random color:</h1>
    <button id="colorButton">Generate Color</button>
    <p id="colorDisplay">Color: </p>

    <script>
        document.getElementById('colorButton').addEventListener('click', () => {
            const randomColor = `#${Math.floor(Math.random() * 16777215).toString(16)}`;
            document.body.style.backgroundColor = randomColor;
            document.getElementById('colorDisplay').textContent = `Color: ${randomColor}`;
        });
    </script>
</body>
</html>