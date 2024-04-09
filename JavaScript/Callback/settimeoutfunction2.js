function tomato(veggies){

setTimeout(() => {

    let veg = '🍅';
    console.log(veg);
    veggies(veg);

}, 4000);

}

tomato((veg) =>{
    console.log("got veggies", veg);
});