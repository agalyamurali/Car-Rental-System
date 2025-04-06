document.addEventListener("DOMContentLoaded", () => {
    fetch("http://localhost:8080/availablecars")
        .then(response => response.json())
        .then(cars => {
            const dataTable = document.getElementById("availableTable");
            if (!dataTable) {
                console.error("availableTable not found in DOM!");
                return;
            }
            cars.forEach(car => {
                const row = `
                    <tr>
                        <td>${car.car_id}</td>
                        <td>${car.car_model}</td>
                        <td>${car.seat_capacity}</td>
                        <td>${car.price}</td>
                        <td>${car.car_status}</td>
                    </tr>`;
                dataTable.innerHTML += row;
            });
        })
        .catch(error => {
            console.error("Error fetching available cars:", error);
        });
});



 window.onload = function () {
        fetch("http://localhost:8080/availablecars/booked") // Update with correct endpoint
            .then((response) => response.json())
            .then((bookedCars) => {
                const dataTable = document.getElementById("rentedcars");

                bookedCars.forEach((bookedCar) => {
                    const row = `
                        <tr>
                            <td>${bookedCar.name}</td>
                            <td>${bookedCar.email}</td>
                            <td>${bookedCar.phone}</td>
                            <td>${bookedCar.days}</td>
                            <td>${bookedCar.model}</td>
                        </tr>`;
                    dataTable.innerHTML += row;
                });
            })
            .catch((error) => {
                console.error("Error fetching booked cars:", error);
            });
    };

