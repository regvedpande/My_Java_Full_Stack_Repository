let a = {name: "Regved", age: 25};
let b = {...a};
a.age = 23;
console.log(a.age);
console.log(b.age);