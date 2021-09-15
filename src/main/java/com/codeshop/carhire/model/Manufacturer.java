package com.codeshop.carhire.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import javax.xml.transform.sax.SAXResult;

@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(unique = true,length = 10)
    private String manufacturerCode;
    private String manufacturerName;

    public Manufacturer(){

    }

    public Manufacturer(String manufacturerCode, String manufacturerName) {
        this.manufacturerCode = manufacturerCode;
        this.manufacturerName = manufacturerName;
    }

    public long getId() {
        return id;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
