package com.codeshop.carhire.model;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String url;

    @ManyToOne
    private Vehicle vehicleId;

    public Image(){

    }

    public Image(String url, Vehicle vehicleId) {
        this.url = url;
        this.vehicleId = vehicleId;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Vehicle getVehicle() {
        return vehicleId;
    }

    public void setVehicle(Vehicle vehicleId) {
        this.vehicleId = vehicleId;
    }
}
