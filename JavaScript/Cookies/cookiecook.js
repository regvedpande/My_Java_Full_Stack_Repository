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
  document.cookie = name + '=; Max-Age=-99999999; path=/';
}

// Example usage:
setCookie("username", "JohnDoe", 7); // Sets a cookie named "username" with value "JohnDoe" that expires in 7 days.

const username = getCookie("username"); // Retrieves the value of the "username" cookie.

if (username) {
  console.log("Username:", username); // Output: Username: JohnDoe
} else {
    console.log("username cookie not set");
}

//eraseCookie("username"); // Deletes the cookie

//confirm the cookie is erased:
const userNameAfterErasure = getCookie("username");

if(!userNameAfterErasure){
    console.log("The username cookie was erased.")
}
