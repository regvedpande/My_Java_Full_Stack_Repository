// let store = () =>{
//     console.log("This is my Info getting stored");
// }

// setTimeout(store, 3000);

function sum(a,b){
    console.log(a + b);
}

function add(a, b, callback){
    callback(a,b);
}

add(1, 5, sum);