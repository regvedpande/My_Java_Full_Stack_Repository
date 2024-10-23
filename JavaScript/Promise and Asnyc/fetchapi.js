const randomAPIURL = "https://api.randomuser.me/";

let store = async () => {
    console.log("getting data......");
    let response = await fetch(randomAPIURL);
    console.log(response.status);
};