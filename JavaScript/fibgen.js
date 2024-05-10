function isPalindrome(str) {
    str = str.toLowerCase().replace(/[\W_]/g, ''); // Convert to lowercase and remove non-alphanumeric characters
    var reversedStr = str.split('').reverse().join('');
    return str === reversedStr;
}

var testString = "A man, a plan, a canal, Panama!"; // Change the string to test different palindromes
console.log("\"" + testString + "\" is a palindrome:", isPalindrome(testString));
