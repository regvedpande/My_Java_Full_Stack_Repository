function maxOccurringChar(str) {
    let charMap = {};
    let maxChar = '';
    let maxCount = 0;

    str.split('').forEach(char => {
        charMap[char] = charMap[char] ? charMap[char] + 1 : 1;
        if (charMap[char] > maxCount) {
            maxCount = charMap[char];
            maxChar = char;
        }
    });

    return maxChar;
}

console.log(maxOccurringChar("Hello World")); // Output: l
console.log(maxOccurringChar("javascript")); // Output: a
