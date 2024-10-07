// Depth: You can control how deep the flattening goes by providing an optional depth argument. Here's how it works:
// depth = 1 (default): Flattens the array one level deep.
// depth = 2: Flattens the array two levels deep.
// depth = Infinity: Flattens all levels of nesting.
//Use of flat() method in an Array
let list = ['1',['3'],'5','8',['6','7']];
let store = list.flat(Infinity);
console.log(store);