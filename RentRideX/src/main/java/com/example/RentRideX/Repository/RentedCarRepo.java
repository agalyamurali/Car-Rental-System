package com.example.RentRideX.Repository;

import com.example.RentRideX.Model.RentedCars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentedCarRepo extends JpaRepository<RentedCars, Integer> {
}
