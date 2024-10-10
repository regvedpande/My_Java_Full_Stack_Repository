// let btn = document.querySelector("#leave");
// btn.onclick = () => {
//     console.log("mouse leave");
// }

// let btn2 = document.addEventListener("click", ()=>{
//     console.log("Hello Regved");
// })


// let handler =()=>{
//     console.log("Hello Regved");
// }

// let removed = document.removeEventListener("click", handler);
let store = document.querySelector("#mode")
let background = "light";

let btn = document.addEventListener("click", () =>{
if(background == "light"){
    background = "dark";
    document.querySelector("body").style.backgroundColor = "grey";
}else {
    background="light";
    document.querySelector("body").style.backgroundColor = "white";
}
});