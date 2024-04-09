// For making Pizza you need this Ingredients (Dough, Cheese, Pizza Sauce, Toppings)

function getdough(callback){
    setTimeout(() => {
        let dough = '🌾';
        console.log("Your Dough is getting Ready" + dough);
        callback(dough);
    }, 1000);
}

function getcheese(callback2){
    setTimeout(() => {
        let cheese = '🧀';
        console.log("Your Cheese is getting Ready" + cheese);
        callback2(cheese);
    }, 2000);
}

function getsauce(callback3){
    setTimeout(() => {
        let sauce = '🫙';
        console.log("Your Sauce is getting Ready" + sauce);
        callback3(sauce);
    }, 3000);
}

function gettoppings(callback4){
    setTimeout(() => {
        let toppings = '🫑';
        console.log("Your toppings is getting Ready" + toppings);
        callback4(toppings);
    }, 4000);
}

function getall(dough, cheese, sauce, toppings, finalcallback){
    setTimeout(() => {
        let pizza = dough + cheese + sauce + toppings;
        console.log("Your Pizza is getting Ready" + pizza);
        finalcallback(pizza);
    }, 5000);
}


getdough((dough) => {
    getcheese((cheese) => {
        getsauce((sauce) => {
            gettoppings((toppings) => {
                getall(dough, cheese, sauce, toppings, (pizza) => {
                    console.log("Pizza is ready: " + pizza + "=" + 'Yum Yum 😋🍕');
                });
            });
        });
    });
});
