// Function to set a cookie
function setCookie(name, value, days) {
    var expires = "";
    if (days) {
        var date = new Date();
        date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
        expires = "; expires=" + date.toUTCString();
    }
    document.cookie = name + "=" + (value || "") + expires + "; path=/";
}

// Function to get a cookie by name
function getCookie(name) {
    var nameEQ = name + "=";
    var ca = document.cookie.split(';');
    for (var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) === ' ') c = c.substring(1, c.length);
        if (c.indexOf(nameEQ) === 0) return c.substring(nameEQ.length, c.length);
    }
    return null;
}

// Function to delete a cookie
function deleteCookie(name) {
    document.cookie = name + '=; Max-Age=-99999999;';
}

// Example usage:
setCookie("username", "JohnDoe", 7); // Sets a cookie 'username' with value 'JohnDoe' that expires in 7 days
console.log(getCookie("username")); // Logs 'JohnDoe'
deleteCookie("username"); // Deletes the 'username' cookie
console.log(getCookie("username")); // Logs 'null' as the cookie is deleted