package com.entity;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue("Car")

public class CarInsurance extends Insurance {
    private String vehicleType;
    private String vehicleUsing;
    private String driverHistory;


    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleUsing() {
        return vehicleUsing;
    }

    public void setVehicleUsing(String vehicleUsing) {
        this.vehicleUsing = vehicleUsing;
    }

    public String getDriverHistory() {
        return driverHistory;
    }

    public void setDriverHistory(String driverHistory) {
        this.driverHistory = driverHistory;
    }
}
