const myButton = document.getElementById("myButton");

myButton.addEventListener("click", function(event) {
  console.log("Button clicked!");
  console.log(event); // Provides event details
});
