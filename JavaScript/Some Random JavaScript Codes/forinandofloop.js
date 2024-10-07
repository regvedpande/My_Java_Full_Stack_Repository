let smartphones = {
    apple : "150000",
    samsung : "120000",
    oneplus : "60000",
}
//For in Loop
for (let key in smartphones) {
    console.log(smartphones[key])
}
//smartphones is not iterable must be character or string
// for (let iterator of smartphones) {
//     console.log(smartphones[iterator])
// }

//For of Loop : Loops through value of an Object(Regved)
for (let iterator of "Regved") {
    console.log(iterator)
}