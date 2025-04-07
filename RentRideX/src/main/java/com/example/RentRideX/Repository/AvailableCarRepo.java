package com.example.RentRideX.Repository;

import com.example.RentRideX.Model.AvailableCars;
import com.example.RentRideX.Model.RentedCars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailableCarRepo extends JpaRepository<AvailableCars, Integer> {
}
