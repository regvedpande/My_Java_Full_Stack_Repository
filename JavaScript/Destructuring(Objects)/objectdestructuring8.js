let cars = () => ({
    name: "Bugatti",
    origin: "France",
    topspeed: "420km/h",
    color: {
        paint1: "Red",
        paint2: "Blue",
    }
});

let { name, origin, topspeed, color: { paint1, paint2 } } = cars();
console.log(name);
console.log(origin);
console.log(topspeed);
console.log(paint1);
console.log(paint2);