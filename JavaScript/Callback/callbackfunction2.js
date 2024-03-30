const geeky = (callback) => {
    const a = 101;
    callback(a);
}

geeky((a) => {
    console.log("I am show Function " + a);
});
