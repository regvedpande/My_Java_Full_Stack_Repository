/* This JavaScript function calculates the total number of days between a start date and an end date,
excluding Saturdays and Sundays if specified. It first retrieves the start and end dates from input fields.
Then, it checks if Saturday and Sunday exclusion checkboxes are selected. It iterates through each day between
the start and end dates, incrementing a counter for each non-excluded weekday. Finally, it updates the HTML 
element with the calculated total days.*/

function calculateDays() {
    // Retrieve start and end dates from input fields
    const startDate = new Date(document.getElementById('start-date').value);
    const endDate = new Date(document.getElementById('end-date').value);

    // Check if Saturday and Sunday exclusion checkboxes are selected
    const excludeSaturday = document.getElementById('exclude-saturday').checked;
    const excludeSunday = document.getElementById('exclude-sunday').checked;

    // Initialize totalDays counter
    let totalDays = 0;

    // Iterate through each day between start and end dates
    while (startDate <= endDate) {

        /*For each day, it asks, "Does the user want to exclude Saturdays? If not, or if today isn't a 
        Saturday, let's count this day!"It repeats the same check for Sundays.*/

        // If Saturday exclusion is not selected or if today is not Saturday, if condition is true count the day
        if (!excludeSaturday || startDate.getDay() !== 6) {
            // If Sunday exclusion is not selected or if today is not Sunday, count the day
            if (!excludeSunday || startDate.getDay() !== 0) {
                // Increment totalDays for each non-excluded weekday
                totalDays++;
            }
        }
        // After Processing Current Day it Move to the next day
        startDate.setDate(startDate.getDate() + 1);
    }

    // Update HTML element with the total days calculated
    document.getElementById('result').innerText = `Total Days: ${totalDays}`;
}
