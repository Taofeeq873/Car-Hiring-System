package com.codeshop.carhire.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(unique = true,length = 10)
    private String regNumber;
    private String currentMillage;
    private String dailyHireRate;
    private String engineSize;
    private Date dateMotDue;
    @ManyToOne
    private Model modelCodeId;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany
    @JoinTable(name = "vehicle_category",
            joinColumns = @JoinColumn(name = "vehicle_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    List<Category> categories;

    private String url;

    public Vehicle(){

    }

    public Vehicle(String regNumber, String currentMillage, String dailyHireRate, String engineSize, Date dateMotDue, Model modelCodeId, List<Category> categories, String url) {
        this.regNumber = regNumber;
        this.currentMillage = currentMillage;
        this.dailyHireRate = dailyHireRate;
        this.engineSize = engineSize;
        this.dateMotDue = dateMotDue;
        this.modelCodeId = modelCodeId;
        this.categories = categories;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getCurrentMillage() {
        return currentMillage;
    }

    public void setCurrentMillage(String currentMillage) {
        this.currentMillage = currentMillage;
    }

    public String getDailyHireRate() {
        return dailyHireRate;
    }

    public void setDailyHireRate(String dailyHireRate) {
        this.dailyHireRate = dailyHireRate;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public Date getDateMotDue() {
        return dateMotDue;
    }

    public void setDateMotDue(Date dateMotDue) {
        this.dateMotDue = dateMotDue;
    }

    public Model getModelCodeId() {
        return modelCodeId;
    }

    public void setModelCodeId(Model modelCodeId) {
        this.modelCodeId = modelCodeId;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
