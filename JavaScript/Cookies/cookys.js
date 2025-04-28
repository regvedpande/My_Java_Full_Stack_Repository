/**
 * Sets a cookie.
 *
 * @param {string} name - The name of the cookie.
 * @param {string} value - The value of the cookie.
 * @param {number} [days] - Optional. The number of days until the cookie expires. If not provided, it becomes a session cookie (expires when the browser closes).
 * @param {string} [path='/'] - Optional. The path for which the cookie is valid. Defaults to the root path '/'.
 */
function setCookie(name, value, days, path = '/') {
    let expires = "";
    if (days) {
        const date = new Date();
        // Calculate expiration date in milliseconds
        date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
        expires = "; expires=" + date.toUTCString(); // Format as UTC string
    }
    // Encode value to handle special characters (like semicolons, spaces)
    const encodedValue = encodeURIComponent(value || "");
    // Construct the cookie string and assign it
    document.cookie = encodeURIComponent(name) + "=" + encodedValue + expires + "; path=" + path;
    console.log(`Cookie "${name}" set with value "${value}"`);
}

/**
 * Gets the value of a specific cookie by name.
 *
 * @param {string} name - The name of the cookie to retrieve.
 * @returns {string|null} The value of the cookie, or null if not found.
 */
function getCookie(name) {
    const nameEQ = encodeURIComponent(name) + "=";
    // Split document.cookie string into individual cookies
    const ca = document.cookie.split(';');
    for (let i = 0; i < ca.length; i++) {
        let c = ca[i];
        // Remove leading whitespace
        while (c.charAt(0) === ' ') {
            c = c.substring(1, c.length);
        }
        // Check if this cookie string starts with the name we want
        if (c.indexOf(nameEQ) === 0) {
            const value = c.substring(nameEQ.length, c.length);
            // Decode the value and return it
            return decodeURIComponent(value);
        }
    }
    // Return null if cookie not found
    return null;
}

// --- Example Usage ---

// 1. Set a cookie named 'username' with value 'JohnDoe' that expires in 7 days
setCookie('username', 'JohnDoe', 7);

// 2. Set a session cookie (expires when browser closes) named 'theme'
setCookie('theme', 'dark');

// 3. Get the value of the 'username' cookie
const storedUsername = getCookie('username');
if (storedUsername) {
    console.log(`Found username cookie: ${storedUsername}`);
} else {
    console.log('Username cookie not found.');
}

// 4. Try to get a non-existent cookie
const nonExistent = getCookie('someOtherCookie');
console.log(`Value of 'someOtherCookie': ${nonExistent}`); // Will log: Value of 'someOtherCookie': null

// Optional: To delete a cookie, set its expiration date to the past
// setCookie('username', '', -1); // Sets username value to empty and expires it immediately
// console.log(`Cookie 'username' deleted (check Application tab in DevTools).`);
