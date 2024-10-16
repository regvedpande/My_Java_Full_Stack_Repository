class Car{
    constructor(owner){
        this.owner = owner;
    }
    engine(){
        console.log("Car have Engine");
    }
    brakes(){
        console.log("Car have brakes");
    }
    wheels(){
        console.log("Car have wheels");
    }
}

class Bugatti extends Car{
    constructor(owner){
        super(owner);
    }
    BugattiEngine(){
        console.log("Bugatti have V8 Engine");
    }
    
}

let bugatti = new Bugatti("Regved Pande");
bugatti.engine();
bugatti.brakes();
bugatti.wheels();
bugatti.BugattiEngine();
console.log(bugatti.owner);