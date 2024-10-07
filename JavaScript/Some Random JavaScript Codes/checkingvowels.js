// function checkvowels(str){
//     let count = 0;
//     for(let check of str){
//         if(check === "a" || check === "e" || check === "i" || check === "o" || check === "u"){
//             count++;
//         }
//     }

//     return count;
// }

// console.log("Vowels in the given word is  : ", checkvowels("Regved"));


// Now the Same task using the Arrow Function
let store = (str) =>{
    let count = 0;
    for (const check of str) {
        if(check === "a" || check === "e" || check === "i" || check === "o" || check === "u"){
            count++;
        }
    }
    return count;
}

console.log(store("Regved"));