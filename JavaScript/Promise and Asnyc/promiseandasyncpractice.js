const ticket = new Promise(function(resolve, reject){
const board = false;
if (board) {
    resolve("You are not in the Flight");
} else {
    reject("Your flight is being Cancelled");
}

})

ticket
.then((message) =>{
    console.log(message);
})

.catch((error) =>{
    console.log(error);
})