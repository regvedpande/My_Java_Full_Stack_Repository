function getApple(){
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            const apple = '🍎';
            console.log("Here is you Apple : " + apple);
            resolve(apple);
        },2000);
    });
}

function getPie(){
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            const pie = '🥧';
            console.log("Here is your Apple Pie : " + pie);
            resolve(pie);
        },3000);
    });
}

