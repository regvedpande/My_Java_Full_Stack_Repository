let prices = [200,300,400,500,600];

// let a = 0;

// for( let list of prices ) {
//     console.log(`Prices before are ${list}`);
//     let discount = list/10;
//     prices[a] = prices[a] - discount;
//     console.log(`Value after the offer is ${prices[a]}`);
//     a++;
// }

// Adding First Element in the Array
prices.unshift(900);
console.log("Adding first element in front we get", prices);

// Adding Last Element in the Array
prices.push(1200);
console.log("Adding last element in front we get", prices);

// Slice Use in Array
let sliced = prices.slice(2,4);
console.log("After Slicing we get", sliced);

let spliced = prices.splice(2,2,"regved","delia");
console.log("After Splicing we get", spliced);