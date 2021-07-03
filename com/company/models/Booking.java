package com.company.models;
import express.database.Model;
import org.dizitart.no2.objects.Id;

import java.util.ArrayList;

@Model
public class Booking {

    @Id
    private String id;
    private Customer customer;
    private Viewing viewing;
    private int nrOfSeats;
    private int price;
    private String bookingRef;
    private ArrayList<BookedSeat> bookedSeat;

    public Booking(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Viewing getViewing() {
        return viewing;
    }

    public void setViewing(Viewing viewing) {
        this.viewing = viewing;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(String bookingRef) {
        this.bookingRef = bookingRef;
    }

    public ArrayList<BookedSeat> getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(ArrayList<BookedSeat> bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", viewing=" + viewing +
                ", nrOfSeats=" + nrOfSeats +
                ", price=" + price +
                ", bookingRef='" + bookingRef + '\'' +
                ", bookedSeat=" + bookedSeat +
                '}';
    }
}
