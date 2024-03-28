let details = () => ({
    name: "Regved",
    age: "23",
    birthsign: "Leo",
});

let grasp = (g) => {
    return g();
}

let {name, age, birthsign} = grasp(details);
console.log(name);
console.log(age);
console.log(birthsign);