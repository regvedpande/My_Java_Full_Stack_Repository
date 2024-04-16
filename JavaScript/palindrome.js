function isPalindrome(str) {
    str = str.toLowerCase().replace(/[^a-zA-Z0-9]/g, '');
    return str === str.split('').reverse().join('');
}

console.log(isPalindrome("A man, a plan, a canal, Panama"));
console.log(isPalindrome("racecar")); // Output: true
console.log(isPalindrome("hello")); // Output: false
