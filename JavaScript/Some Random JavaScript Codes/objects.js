class Random {
    regveddetails() {
        console.log("Regved Pande");
    }
    age() {
        console.log("24");
    }
    carname(brand) {
        this.brandname = brand;
    }
}

const random = new Random();

random.regveddetails();
random.age();

let moreregveddetails = {
    name: "Name is ",
};

Object.setPrototypeOf(moreregveddetails, Random.prototype);

console.log(moreregveddetails.name);
moreregveddetails.age();
moreregveddetails.regveddetails();

let ayush = new Random();
ayush.carname("BMW");
console.log(ayush.brandname);