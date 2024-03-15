let age = prompt("Enter your Age");

if (age < 18) {
    if (age < 0) {
        console.error('Error');
    } else if(age > 4){
        location.replace("https://www.google.com");
    }
    alert("You cannot drive");
} else {
    if (confirm("Do you wish to proceed?")) {
        alert("You can drive");
    } else {
        alert("You cannot proceed");
    }
}
