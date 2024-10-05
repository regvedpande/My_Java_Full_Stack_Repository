let prices = [200,300,400,500,600];

let a = 0;

for( let list of prices ) {
    console.log(`Prices before are ${list}`);
    let discount = list/10;
    prices[a] = prices[a] - discount;
    console.log(`Value after the offer is ${prices[a]}`);
    a++;
}