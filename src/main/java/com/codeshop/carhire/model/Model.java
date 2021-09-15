package com.codeshop.carhire.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(unique = true,length = 10)
    private String modelCode;
    private String dailyHireRate;
    private String modelName;
    @ManyToOne
    private Manufacturer manufacturerCodeId;

    public Model(){

    }

    public Model(String modelCode, String dailyHireRate, String modelName, Manufacturer manufacturerCodeId) {
        this.modelCode = modelCode;
        this.dailyHireRate = dailyHireRate;
        this.modelName = modelName;
        this.manufacturerCodeId = manufacturerCodeId;
    }

    public long getId() {
        return id;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getDailyHireRate() {
        return dailyHireRate;
    }

    public void setDailyHireRate(String dailyHireRate) {
        this.dailyHireRate = dailyHireRate;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Manufacturer getManufacturerCodeId() {
        return manufacturerCodeId;
    }

    public void setManufacturerCodeId(Manufacturer manufacturerCodeId) {
        this.manufacturerCodeId = manufacturerCodeId;
    }
}
