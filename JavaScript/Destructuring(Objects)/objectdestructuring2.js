let list = () => ({
    name: "Regved",
    age: "23",
    sunsign: "Leo",
});

let { name : contain, age : store, sunsign : capture } = list();
console.log(contain);
console.log(store);
console.log(capture);