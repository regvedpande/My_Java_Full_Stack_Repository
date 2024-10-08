let store = document.querySelector('.name');
store.style.height = '100px';
store.style.width = '100px';
store.style.backgroundColor = 'red';
store.innerText = 'Delia';
console.log(store);


let add = document.querySelector('h1');
add.innerHTML = "<h2>Monaco</h2>";
add.style.color = 'blue';

document.querySelector("body").prepend(add);

