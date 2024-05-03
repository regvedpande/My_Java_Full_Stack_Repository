<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Password Reset</title>
<style>
  body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-color: #f1f1f1;
  }

  .password-reset-container {
    width: 100%;
    max-width: 400px;
    margin: 50px auto;
    background-color: #9896f1;
    padding: 40px;
    border-radius: 8px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
    text-align: center;
  }

  h2 {
    margin-bottom: 30px;
    color: #B8BACF;
  }

  input[type="password"] {
    width: 100%;
    padding: 12px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 1px solid #B8BACF;
    border-radius: 4px;
    outline: none;
  }

  input[type="submit"] {
    background-color: #f9f9f9;
    color: #ff6f61;
    border: 1px solid #ff6f61;
    padding: 14px 20px;
    margin: 8px 0;
    border-radius: 4px;
    cursor: pointer;
    width: 100%;
    font-size: 16px;
    outline: none;
    transition: background-color 0.3s ease, color 0.3s ease;
  }

  input[type="submit"]:hover {
    background-color: #ff6f61;
    color: #f9f9f9;
  }

  .error-message {
    color: #ff0000;
    margin-top: 10px;
  }
</style>
</head>
<body>
<div class="password-reset-container">
    <h2>Password Reset</h2>
    <form id="password-reset-form">
        <input type="password" id="new-password" name="new-password" placeholder="New Password" required>
        <input type="password" id="confirm-password" name="confirm-password" placeholder="Confirm Password" required>
        <input type="submit" value="Submit Password" onclick="changePassword(event)">
        <p class="error-message" id="error-message"></p>
    </form>
</div>

<script>
function changePassword(event) {
    event.preventDefault();

    var newPassword = document.getElementById("new-password").value;
    var confirmPassword = document.getElementById("confirm-password").value;
    var errorMessage = document.getElementById("error-message");

    // Validate passwords
    if (newPassword !== confirmPassword) {
        errorMessage.textContent = "Passwords do not match.";
        return;
    }

    // Store the updated password in local storage
    localStorage.setItem("password", newPassword);

    // Redirect to the login page after successfully changing the password
    window.location.replace("loginpage.html");
}
</script>


</body>
</html>
