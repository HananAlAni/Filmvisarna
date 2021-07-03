package com.company.models;
import express.database.Model;

@Model
public class BookedSeat {
    private String row;
    private String seats;

    public BookedSeat(){  };

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}




