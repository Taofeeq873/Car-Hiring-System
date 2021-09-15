package com.codeshop.carhire.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date dateFrom;
    private Date dateTo;
    @ManyToOne
    private Customer customerId;
    @OneToOne
    private BookingStatus bookingStatusCodeId;
    @ManyToOne
    private Vehicle vehicleRegNum;

    public Booking(){

    }

    public Booking(Date dateFrom, Date dateTo, Customer customerId, BookingStatus bookingStatusCodeId, Vehicle vehicleRegNum) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.customerId = customerId;
        this.bookingStatusCodeId = bookingStatusCodeId;
        this.vehicleRegNum = vehicleRegNum;
    }

    public long getId() {
        return id;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public BookingStatus getBookingStatusCodeId() {
        return bookingStatusCodeId;
    }

    public void setBookingStatusCodeId(BookingStatus bookingStatusCodeId) {
        this.bookingStatusCodeId = bookingStatusCodeId;
    }

    public Vehicle getVehicleRegNum() {
        return vehicleRegNum;
    }

    public void setVehicleRegNum(Vehicle vehicleRegNum) {
        this.vehicleRegNum = vehicleRegNum;
    }
}
