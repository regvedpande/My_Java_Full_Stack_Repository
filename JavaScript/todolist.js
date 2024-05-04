// Todo list array to store tasks
let todoList = [];

// Function to add a task to the todo list
function addTask(task) {
  todoList.push(task);
  console.log("Task added:", task);
}

// Function to remove a task from the todo list
function removeTask(task) {
  const index = todoList.indexOf(task);
  if (index !== -1) {
    todoList.splice(index, 1);
    console.log("Task removed:", task);
  } else {
    console.log("Task not found:", task);
  }
}

// Example usage: Adding and removing tasks
addTask("Buy groceries");
addTask("Finish homework");
addTask("Walk the dog");
removeTask("Finish homework");
console.log("Current Todo List:", todoList);
