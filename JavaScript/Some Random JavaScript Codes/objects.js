let random = {
    regveddetails() {
        console.log("Regved Pande");
    },
    age : function(){
        console.log("24");
    },

    carname(brand){
        this.brandname = brand;
        },
}

random.regveddetails();
random.age();

let moreregveddetails = {
    name : "Name is ",
}

moreregveddetails.__proto__ = random;

console.log(moreregveddetails.name);
console.log(moreregveddetails.age());
console.log(moreregveddetails.regveddetails());

let ayush = new random();
ayush.carname("BMW");
console.log(ayush.brandname);



