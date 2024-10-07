let num1 = parseFloat(prompt("Enter first number:"));
let num2 = parseFloat(prompt("Enter second number:"));

let operator = prompt("Enter operator (+, -, *, /):");

let result;
switch (operator) {
  case "+":
    result = num1 + num2;
    break;
  case "-":
    result = num1 - num2;
    break;
  case "*":
    result = num1 * num2;
    break;
  case "/":
    if (num2 === 0) {
      alert("Error: Division by zero!");
    } else {
      result = num1 / num2;
    }
    break;
  default:
    alert("Invalid operator!");
}

if (result !== undefined) {
  console.log(`${num1} ${operator} ${num2} = ${result}`);
}
