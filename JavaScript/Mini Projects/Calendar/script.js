function calculateDays() {
    const startDate = new Date(document.getElementById('start-date').value);
    const endDate = new Date(document.getElementById('end-date').value);

    const excludeSaturday = document.getElementById('exclude-saturday').checked;
    const excludeSunday = document.getElementById('exclude-sunday').checked;

    let totalDays = 0;

    while (startDate <= endDate) {
        if (!excludeSaturday || startDate.getDay() !== 6) {
            if (!excludeSunday || startDate.getDay() !== 0) {
                totalDays++;
            }
        }
        startDate.setDate(startDate.getDate() + 1);
    }

    document.getElementById('result').innerText = `Total Days: ${totalDays}`;
}
