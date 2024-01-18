// Dummy data for confirmation message
const bookingDetails = {
    movie: "Animal",
    date: "2024-01-11",
    time: "11:00",
    seats: 2,
};

// Display confirmation message on page load
document.addEventListener("DOMContentLoaded", function () {
    displayConfirmation();
});

// Function to display booking confirmation details
function displayConfirmation() {
    const confirmationMessage = document.getElementById("confirmation-message");
    confirmationMessage.innerHTML = `
        <p>Thank you for your booking!</p>
        <p>Movie: ${bookingDetails.movie}</p>
        <p>Date: ${bookingDetails.date}</p>
        <p>Time: ${bookingDetails.time}</p>
        <p>Seats: ${bookingDetails.seats}</p>
    `;
}

// Function to navigate to the home page (you can replace this with your actual home page URL)
function goToHomePage() {
    window.location.href = "index.html";
}
