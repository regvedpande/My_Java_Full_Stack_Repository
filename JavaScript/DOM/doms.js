<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>DOM Manipulation Example</title>
</head>
<body>
    <h1 id="myHeading">Hello, World!</h1>
    <button onclick="changeText()">Click Me!</button>

    <script>
        function changeText() {
            document.getElementById("myHeading").textContent = "You've clicked the button!";
        }
    </script>
</body>
</html>