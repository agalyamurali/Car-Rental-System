package com.example.RentRideX.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class RentedCars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String phone;
    private String days;
    private String model;


    public RentedCars(String name, String email, String phone, String days , String model){

        this.model = model;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.days = days;

    }


}
