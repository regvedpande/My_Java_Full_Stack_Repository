let array = [1,-3,4,5,6,7];

let compare = (check) =>{
        return check < 0;
}

let result = array.find(compare);

let result2 = array.findIndex(compare);

array.forEach((num, i) =>{
console.log(num, i);
})

console.log(result);

console.log(result2);