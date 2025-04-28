function setCookie(name, value, days) {
  let expires = "";
  if (days) {
    const date = new Date();
    date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
    expires = "; expires=" + date.toUTCString();
  }
  document.cookie = name + "=" + (value || "")  + expires + "; path=/";
}

// Example usage:
// Set a cookie named 'username' with the value 'JohnDoe' that expires in 7 days
// setCookie("username", "JohnDoe", 7);

// Set a cookie named 'lastVisit' with the value of the current timestamp that expires when the browser closes
// setCookie("lastVisit", Date.now());
