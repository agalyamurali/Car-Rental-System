package com.example.RentRideX.Controller;


import com.example.RentRideX.Model.AvailableCars;
import com.example.RentRideX.Model.RentedCars;
import com.example.RentRideX.Service.RentedCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RentalController {

    @Autowired
    RentedCarService rentedcarService;


    @GetMapping("/availablecars")
    public List<AvailableCars> displayCars() {
        return rentedcarService.displayCars();
    }

    @GetMapping("/availablecars/booked")
    public List<RentedCars> displayBookedCars()
    {
        return rentedcarService.displayBookedCars();

    }
    @PostMapping("/bookings")
    public String bookedCars(@RequestParam("name") String name,
                             @RequestParam("email") String email,
                             @RequestParam("phone") String phone,
                             @RequestParam("days")  String days,
                             @RequestParam("model") String model) {
        try {
            rentedcarService.bookedCars(name, email, phone, days, model);
            return "Congratulations " + name + " . You have successfully registered " + model;
        } catch (Exception e) {
            e.printStackTrace(); // Logs the exact error to console
            return "Something went wrong: " + e.getMessage(); // You can customize this message
        }
    }



}
