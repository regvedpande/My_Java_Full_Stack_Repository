//Create a variable of type String and try to add a number to it
let variable = "Regved";
let age = 23;
let sum = variable + Number(age); //JavaScript will implicitly convert the number to a string and concatenate them
console.log(sum);

//Use typeof operator to find the datatype of the string in last question
let id = 8648734394n;
console.log(typeof id);

/*Create a const object in javascript can you change it to hold a number later
and also add new key to an object*/
const store = {
    name : "Regved Pande",
    age : "23",
    phone : "9049874883",
    key : 456,
}
console.log("Before Updation");
console.log(store);

console.log("After Updation");
store.key = 460;
console.log(store);

//You can insert value like this above as store is a reference to the object
store['address'] = "Nagpur";
console.log("After adding Address we get");
console.log(store);

/*Note : When you declare an object within a block, it's only accessible within that block,
helping to prevent naming conflicts and accidental overwrites.*/
//Creating a Word Meaning Dictionary of 5 Words
const dictionary = {
    abate: "To lessen or decrease in intensity. (verb)",
    eclectic: "Choosing from various sources or styles. (adjective)", 
    jubilant: "Expressing great joy or triumph. (adjective)",
    labyrinth: "A complex maze of paths or passages. (noun)",
    zealous: "Filled with passionate enthusiasm for a cause. (adjective)" 
};

console.log(dictionary);

console.log("You can also access elements like this ");

console.log(dictionary.abate);
//or
console.log(dictionary['eclectic']);

