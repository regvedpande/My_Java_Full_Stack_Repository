// Function to set a cookie
function setCookie(name, value, days) {
    const date = new Date();
    date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
    const expires = "expires=" + date.toUTCString();
    document.cookie = name + "=" + value + ";" + expires + ";path=/";
}

// Function to get a cookie
function getCookie(name) {
    const nameEQ = name + "=";
    const ca = document.cookie.split(';');
    for (let i = 0; i < ca.length; i++) {
        let c = ca[i];
        while (c.charAt(0) === ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(nameEQ) === 0) {
            return c.substring(nameEQ.length, c.length);
        }
    }
    return null;
}

// Function to delete a cookie
function deleteCookie(name) {
    document.cookie = name + '=; Max-Age=0; path=/';
}

// Example usage
setCookie("username", "JohnDoe", 7); // Set a cookie "username" with value "JohnDoe" for 7 days
console.log(getCookie("username")); // Get the value of the "username" cookie
deleteCookie("username"); // Delete the "username" cookie