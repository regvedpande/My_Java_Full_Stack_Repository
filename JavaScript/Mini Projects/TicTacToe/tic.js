let boxes = document.querySelectorAll(".box");
let resetBtn = document.querySelector("#rst");
let newGameBtn = document.querySelector("#new-btn");
let msgContainer = document.querySelector(".msg-container");
let msg = document.querySelector("#msg");

let turnO = true; //playerX, playerO

const winPatterns = [
  [0, 1, 2],
  [0, 3, 6],
  [0, 4, 8],
  [1, 4, 7],
  [2, 5, 8],
  [2, 4, 6],
  [3, 4, 5],
  [6, 7, 8],
];

const resetGame = () => {
    turnO = true;
    enableBoxes();
    msgContainer.classList.add("hide");

}

boxes.forEach((box) => {
    box.addEventListener("click", () => {
        console.log("You just clicked the box");
        if(turnO){
            box.textContent = "O";
            turnO = false;
        }else{
            box.textContent = "X";
            turnO = true;
        }

        box.disabled = true;
        checkWinner();
    })
})

const showWinner = (winner) => {
msg.innerText = `Congratulations ${winner}! You are the winner!`;
msgContainer.classList.remove("hide");
disableBoxes();
}

const disableBoxes = () => {
    for(let box of boxes){
        box.disabled = true;
    }
}

const enableBoxes = () => {
    for(let box of boxes){
        box.disabled = false;
    }
}

const checkWinner = () => {
for(let pattern of winPatterns){
    let pos1Val = boxes[pattern[0]].textContent;
    let pos2Val = boxes[pattern[1]].textContent;
    let pos3Val = boxes[pattern[2]].textContent;

    if(pos1Val === pos2Val && pos2Val === pos3Val && pos1Val !== ""){
        console.log("winner", pos1Val);
        showWinner(pos1Val);
    }
}
}

newGameBtn.addEventListener("click", resetGame);
resetBtn.addEventListener("click", resetGame);