document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the default form submission

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const errorMessage = document.getElementById('errorMessage');

    // Basic validation
    if (username === 'admin' && password === 'password') {
        alert('Login successful!');
        // Here you can redirect to another page or perform other actions
    } else {
        errorMessage.textContent = 'Invalid username or password';
    }
});
