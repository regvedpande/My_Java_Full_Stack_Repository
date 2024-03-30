// Synchronous
const show = () => {
    console.log("I am show Function");
};

const geeky = (callback) => {
    callback();
};

geeky(show);

console.log("End");

// Asynchronous
setTimeout(() => {
    console.log("I am show Function");
}, 5000);

console.log("End");
