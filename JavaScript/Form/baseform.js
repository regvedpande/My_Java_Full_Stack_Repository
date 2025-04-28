<!DOCTYPE html>
<html>
<head>
<title>Dynamic Form</title>
<style>
  #myForm {
    width: 300px;
    margin: 20px auto;
    border: 1px solid #ccc;
    padding: 20px;
  }
  .form-group {
    margin-bottom: 15px;
  }
  label {
    display: block;
    margin-bottom: 5px;
  }
  input[type="text"], input[type="email"], select {
    width: 100%;
    padding: 8px;
    box-sizing: border-box;
  }
  button {
    padding: 10px 15px;
    background-color: #4CAF50;
    color: white;
    border: none;
    cursor: pointer;
  }
  #results {
    margin-top: 20px;
    border: 1px solid #eee;
    padding: 10px;
  }
</style>
</head>
<body>

<div id="myForm">
  <div class="form-group">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
  </div>
  <div class="form-group">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email">
  </div>
  <div class="form-group">
    <label for="city">City:</label>
    <select id="city" name="city">
      <option value="New York">New York</option>
      <option value="London">London</option>
      <option value="Tokyo">Tokyo</option>
      <option value="Paris">Paris</option>
    </select>
  </div>
  <button onclick="submitForm()">Submit</button>
</div>

<div id="results"></div>

<script>
function submitForm() {
  const name = document.getElementById('name').value;
  const email = document.getElementById('email').value;
  const city = document.getElementById('city').value;

  const resultsDiv = document.getElementById('results');
  resultsDiv.innerHTML = `
    <p><strong>Name:</strong> ${name}</p>
    <p><strong>Email:</strong> ${email}</p>
    <p><strong>City:</strong> ${city}</p>
  `;
}

// Example of adding a new field dynamically:
function addField() {
    const myForm = document.getElementById("myForm");
    const newDiv = document.createElement("div");
    newDiv.className = "form-group";
    const newLabel = document.createElement("label");
    newLabel.textContent = "New Field:";
    const newInput = document.createElement("input");
    newInput.type = "text";
    newInput.name = "newField";

    newDiv.appendChild(newLabel);
    newDiv.appendChild(newInput);
    myForm.insertBefore(newDiv, myForm.lastElementChild); // adds before the submit button.
}

// Example of dynamically creating a form using javascript.
function createFormDynamically(){
    const body = document.body;
    const form = document.createElement("form");
    form.id = "dynamicForm";

    const nameLabel = document.createElement("label");
    nameLabel.textContent = "Dynamic Name:";
    const nameInput = document.createElement("input");
    nameInput.type = "text";
    nameInput.name = "dynamicName";

    const submitButton = document.createElement("button");
    submitButton.textContent = "Dynamic Submit";
    submitButton.type = "button";
    submitButton.onclick = function() {
        const dynamicName = document.getElementById("dynamicForm").dynamicName.value;
        alert("Dynamic Name: " + dynamicName);
    }

    form.appendChild(nameLabel);
    form.appendChild(nameInput);
    form.appendChild(submitButton);
    body.appendChild(form);
}
//example of calling createFormDynamically after 3 seconds.
setTimeout(createFormDynamically, 3000);

//example of adding a button that will add a field.
const addFieldButton = document.createElement("button");
addFieldButton.textContent = "Add Field";
addFieldButton.onclick = addField;
document.getElementById("myForm").appendChild(addFieldButton);

</script>

</body>
</html>
