package com.codeshop.carhire.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(unique = true,length = 10)
    private String vehicleCategoryCode;
    private String vehicleCategoryDescription;

    public Category(){

    }

    public Category(String vehicleCategoryCode, String vehicleCategoryDescription) {
        this.vehicleCategoryCode = vehicleCategoryCode;
        this.vehicleCategoryDescription = vehicleCategoryDescription;
    }

    public long getId() {
        return id;
    }

    public String getVehicleCategoryCode() {
        return vehicleCategoryCode;
    }

    public void setVehicleCategoryCode(String vehicleCategoryCode) {
        this.vehicleCategoryCode = vehicleCategoryCode;
    }

    public String getVehicleCategoryDescription() {
        return vehicleCategoryDescription;
    }

    public void setVehicleCategoryDescription(String vehicleCategoryDescription) {
        this.vehicleCategoryDescription = vehicleCategoryDescription;
    }
}
