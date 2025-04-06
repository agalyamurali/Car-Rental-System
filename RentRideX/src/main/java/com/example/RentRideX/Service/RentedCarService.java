package com.example.RentRideX.Service;


import com.example.RentRideX.Model.AvailableCars;
import com.example.RentRideX.Model.RentedCars;
import com.example.RentRideX.Repository.AvailableCarRepo;
import com.example.RentRideX.Repository.RentedCarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentedCarService {

    @Autowired
    AvailableCarRepo availableCarRepo;

    @Autowired
    RentedCarRepo rentedCarRepo;

    public List<AvailableCars> displayCars(){ return availableCarRepo.findAll();}
    public List<RentedCars> displayBookedCars(){ return rentedCarRepo.findAll();}

    public void bookedCars(String name , String email , String phone , String days, String model) {
        RentedCars rentedcars = new RentedCars(name , email, phone ,days , model);
        rentedCarRepo.save(rentedcars);

    }
}
