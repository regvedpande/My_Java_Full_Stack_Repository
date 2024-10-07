const canvas = document.getElementById("myCanvas");
const ctx = canvas.getContext("2d");

let x = 10;
let y = 10;
let dx = 2; // Change in x for movement
let dy = 3; // Change in y for movement

function draw() {
  ctx.clearRect(0, 0, canvas.width, canvas.height); // Clear the canvas

  ctx.beginPath();
  ctx.arc(x, y, 10, 0, Math.PI * 2); // Draw a circle
  ctx.fillStyle = "red";
  ctx.fill();

  x += dx;
  y += dy;

  // Check for wall collisions
  if (x + dx > canvas.width || x + dx < 0) {
    dx *= -1; // Reverse direction
  }
  if (y + dy > canvas.height || y + dy < 0) {
    dy *= -1;
  }

  requestAnimationFrame(draw); // Animate the next frame
}

draw();
