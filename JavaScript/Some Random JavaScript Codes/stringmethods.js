let myname = "Regved";
console.log(myname.length)

console.log(myname.toUpperCase())
console.log(myname.toLowerCase())
console.log(myname.slice(3))
console.log(myname.slice(2,4))
console.log(myname.replace("Regved", "Krishna"))

let friend = "Prathmesh";
console.log(myname.concat("\tis a Friend of\t", friend))

let anotherfriend = "   Kartik   ";
console.log(anotherfriend.trim())

//For Immutable String
let abbreviation = "IUPAC" + "Nomenclature";
console.log(abbreviation[0])
console.log(abbreviation[1])
console.log(abbreviation[2])
console.log(abbreviation[3])
console.log(abbreviation[4])
console.log(abbreviation)
//Note : You cannot do this in the String abbreviation[2] = S
//Also remember your original string never gets printed repeatedly instead it return new String