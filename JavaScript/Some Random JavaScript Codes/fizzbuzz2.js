let limit = parseInt(prompt("Enter a limit:"));

for (let i = 1; i <= limit; i++) {
  let output = "";
  if (i % 3 === 0) {
    output += "Fizz";
  }
  if (i % 5 === 0) {
    output += "Buzz";
  }
  console.log(output || i); // Print the number if not divisible by 3 or 5
}
