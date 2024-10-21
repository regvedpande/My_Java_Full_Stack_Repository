// let promise = new Promise((resolve, reject) => {
//     console.log("Resolved");
//     resolve("issue resolved");
// })

// function getData(data, getnextdata){
//  return new promise((resolve, reject) =>{
//       setTimeout(() =>{
//         console.log("Time is up", data);
//         if(getnextdata){
//             getnextdata();
//         }
//       }, 2000);
//  })
// }


let promise2 = () =>{
    return new Promise((resolve, reject) =>{
        console.log("Promise is Resolved");
        resolve();
    })
}

let store = promise2();
store.then((res) => {
    console.log("issue is resolved", res);
})

store.catch((rej) => {
    console.log("Rejected", rej);
});