// Sample car data
const cars = [
    { id: 1, brand: "Toyota", model: "Camry", year: 2022, price: 50, image: "images/toyota.jpg" },
    { id: 2, brand: "Honda", model: "Civic", year: 2021, price: 45, image: "images/honda.jpg" },
    { id: 3, brand: "Ford", model: "Mustang", year: 2023, price: 70, image: "images/mustang.jpg" }
];

const bookedCars = [];

// Function to display available cars
function displayAvailableCars() {
    const availableTableBody = document.querySelector("#available-cars tbody");
    availableTableBody.innerHTML = ""; // Clear table

    cars.forEach(car => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td><img src="${car.image}" class="car-img"></td>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.year}</td>
            <td>$${car.price}</td>
            <td><button onclick="bookCar(${car.id})">Book Now</button></td>
        `;
        availableTableBody.appendChild(row);
    });
}

// Function to display booked cars
function displayBookedCars() {
    const bookedTableBody = document.querySelector("#booked-cars tbody");
    bookedTableBody.innerHTML = ""; // Clear table

    bookedCars.forEach(car => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td><img src="${car.image}" class="car-img"></td>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.year}</td>
            <td>$${car.price}</td>
        `;
        bookedTableBody.appendChild(row);
    });
}

// Function to book a car
function bookCar(carId) {
    const carIndex = cars.findIndex(car => car.id === carId);
    if (carIndex !== -1) {
        const bookedCar = cars.splice(carIndex, 1)[0]; // Remove from available cars
        bookedCars.push(bookedCar); // Add to booked cars

        displayAvailableCars(); // Refresh available cars table
        displayBookedCars(); // Refresh booked cars table
    }
}

// Initialize tables
displayAvailableCars();
