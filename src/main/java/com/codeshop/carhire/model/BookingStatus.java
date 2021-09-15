package com.codeshop.carhire.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class BookingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(unique = true,length = 10)
    private String bookingStatusCode;
    private String bookingStatusDescription;

    public BookingStatus(){

    }

    public BookingStatus(String bookingStatusCode, String bookingStatusDescription) {
        this.bookingStatusCode = bookingStatusCode;
        this.bookingStatusDescription = bookingStatusDescription;
    }

    public long getId() {
        return id;
    }

    public String getBookingStatusCode() {
        return bookingStatusCode;
    }

    public void setBookingStatusCode(String bookingStatusCode) {
        this.bookingStatusCode = bookingStatusCode;
    }

    public String getBookingStatusDescription() {
        return bookingStatusDescription;
    }

    public void setBookingStatusDescription(String bookingStatusDescription) {
        this.bookingStatusDescription = bookingStatusDescription;
    }
}
