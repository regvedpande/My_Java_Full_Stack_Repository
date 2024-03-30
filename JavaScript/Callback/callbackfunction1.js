let me = () =>{
        console.log("I showed up");
}

let show = (callback) =>{
    callback();
}

show(me);