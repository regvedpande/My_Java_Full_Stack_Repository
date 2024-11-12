// Arithmetic Operators
function arithmeticOperators(a, b) {
    console.log('Arithmetic Operators:');
    console.log('Addition: ', a + b);
    console.log('Subtraction: ', a - b);
    console.log('Multiplication: ', a * b);
    console.log('Division: ', a / b);
    console.log('Modulus: ', a % b);
    console.log('Exponentiation: ', a ** b);
}

// Assignment Operators
function assignmentOperators(x) {
    console.log('\nAssignment Operators:');
    x += 5;
    console.log('Add and Assign: ', x);
    x -= 3;
    console.log('Subtract and Assign: ', x);
    x *= 2;
    console.log('Multiply and Assign: ', x);
    x /= 4;
    console.log('Divide and Assign: ', x);
    x %= 4;
    console.log('Modulus and Assign: ', x);
}

// Comparison Operators
function comparisonOperators(a, b) {
    console.log('\nComparison Operators:');
    console.log('Equal to (==): ', a == b);
    console.log('Strictly Equal to (===): ', a === b);
    console.log('Not Equal to (!=): ', a != b);
    console.log('Strictly Not Equal to (!==): ', a !== b);
    console.log('Greater than (>): ', a > b);
    console.log('Less than (<): ', a < b);
    console.log('Greater than or Equal to (>=): ', a >= b);
    console.log('Less than or Equal to (<=): ', a <= b);
}

// Logical Operators
function logicalOperators(p, q) {
    console.log('\nLogical Operators:');
    console.log('AND (&&): ', p && q);
    console.log('OR (||): ', p || q);
    console.log('NOT (!): ', !p);
}

// Unary Operators
function unaryOperators(z) {
    console.log('\nUnary Operators:');
    console.log('Increment (++) before: ', ++z);
    console.log('Increment (++) after: ', z++);
    console.log('Decrement (--) before: ', --z);
    console.log('Decrement (--) after: ', z--);
}

// Ternary Operator
function ternaryOperator(a, b) {
    console.log('\nTernary Operator:');
    let result = (a > b) ? 'a is greater' : 'b is greater';
    console.log(result);
}

// Typeof Operator
function typeOfOperator(value) {
    console.log('\nTypeof Operator:');
    console.log('Type of value: ', typeof value);
}

// Delete Operator
function deleteOperator() {
    let person = { name: 'John', age: 25 };
    console.log('\nDelete Operator:');
    console.log('Before delete:', person);
    delete person.age;
    console.log('After delete:', person);
}

// Spread Operator
function spreadOperator() {
    let arr = [1, 2, 3];
    let arr2 = [...arr, 4, 5];
    console.log('\nSpread Operator: ', arr2);
}

// Calling all functions with appropriate arguments
arithmeticOperators(10, 5);
assignmentOperators(10);
comparisonOperators(10, 5);
logicalOperators(true, false);
unaryOperators(5);
ternaryOperator(10, 5);
typeOfOperator(10);
deleteOperator();
spreadOperator();
