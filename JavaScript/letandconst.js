/* Note : Variables declared with `let` and `const` are hoisted (their existence is known), 
but they remain uninitialized, resulting in errors if accessed before their declaration. 
*/

// let has block level scope and can be reassigned and cannot be redeclared
let a = 20;
b = 70;
// b = 40; can also use it like this to update
sum = a + b;
console.log(sum);


// const also has block level scope and cannot be reassigned and redeclared
const x = 10;
// x = 50; will show error
const y = 90;
sum = x + y;
console.log(sum);