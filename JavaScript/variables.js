/* We use 'var' when creating a variable that might change 
later in your entire function or program.*/
//can even run without a value
var a = 50;
a = 70; //we can also change var like this
var b = 40;
var z = a + b;
console.log(z);

/*We use 'let' when creating a variable that might change,
but only within a specific block of code.*/
let c = 10;
c = 20;//we can also change let like this
let d = 20;
let sum = c + d;
console.log(sum);

/* We use 'const' when creating a variable that should not be
reassigned after its initial value is set. It signifies a constant value.*/
const e = 15;
// conse = 2;
const f = 16;
const total = e + f;
console.log(total);

//All in One
let x = 6;
let y = 7;
let all = x+y;
console.log(all);
