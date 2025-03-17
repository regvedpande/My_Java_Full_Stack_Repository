// Function to set a cookie
function setCookie(name, value, days) {
  let expires = "";
  if (days) {
    const date = new Date();
    date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
    expires = "; expires=" + date.toUTCString();
  }
  document.cookie = name + "=" + (value || "") + expires + "; path=/";
}

// Function to get a cookie
function getCookie(name) {
  const nameEQ = name + "=";
  const ca = document.cookie.split(';');
  for (let i = 0; i < ca.length; i++) {
    let c = ca[i];
    while (c.charAt(0) === ' ') {
      c = c.substring(1, c.length);
    }
    if (c.indexOf(nameEQ) === 0) {
      return c.substring(nameEQ.length, c.length);
    }
  }
  return null;
}

// Function to erase a cookie
function eraseCookie(name) {
  document.cookie = name + '=; Max-Age=-99999999;';
}

// Example usage:

// Set a cookie named "username" with the value "JohnDoe" that expires in 7 days
setCookie("username", "JohnDoe", 7);

// Get the value of the "username" cookie
const username = getCookie("username");
if (username) {
  console.log("Username: " + username);
} else {
  console.log("Username cookie not found.");
}

// Set a cookie that expires at the end of the session
setCookie("sessionCookie", "sessionValue");

//Erase the cookie.
eraseCookie("username");

//Example using a form.
document.addEventListener("DOMContentLoaded", function() {
  const nameInput = document.getElementById("nameInput");
  const nameDisplay = document.getElementById("nameDisplay");
  const nameForm = document.getElementById("nameForm");

  const storedName = getCookie("userName"); // different cookie name to avoid confusion with the previous example.

  if(storedName){
    nameDisplay.textContent = "Welcome back, " + storedName + "!";
  }

  nameForm.addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent the default form submission
    const name = nameInput.value;
    setCookie("userName", name, 30); // Store name for 30 days
    nameDisplay.textContent = "Welcome, " + name + "!";
  });
});

