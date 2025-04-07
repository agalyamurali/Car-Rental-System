package com.example.RentRideX.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AvailableCars {

    @Id
    private String car_id;
    private String car_model;
    private String seat_capacity;
    private String price;
    private String car_status;
}
