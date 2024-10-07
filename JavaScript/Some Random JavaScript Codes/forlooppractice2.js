// For of Loop
// let name = "Regved";
// let size = 0;
// for(let i of name){
//     console.log("Characters are : ", i);
//     size++;
// }

// console.log("Size of the String is : ", size);

// For in Loop
let details = {
    name : "Regved",
    age : 23,
    height : 6,
};

for (let key in details) {
    console.log("key=", key, "value=", details[key]);
}