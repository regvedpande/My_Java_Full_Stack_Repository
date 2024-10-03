let details = {
name : "Regved",
age : 23,
starsign : "Leo",
};

console.log(details.name);
console.log(details["age"]);

details["age"] = details["age"] + 1;
console.log(details["age"]);

console.log(typeof details["starsign"]);
console.log(typeof details["age"]);