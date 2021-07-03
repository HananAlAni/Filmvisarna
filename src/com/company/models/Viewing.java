package com.company.models;

import express.database.Model;
import org.dizitart.no2.objects.Id;

import java.util.ArrayList;

@Model
public class Viewing {

    @Id
    private String id;

    private String screen;
    private String movie;
    private String date;
    private String time;
    private int seatsTaken;
    private ArrayList<BookedSeat> bookedSeat;

    public Viewing() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSeatsTaken() {
        return seatsTaken;
    }

    public void setSeatsTaken(int seatsTaken) {
        this.seatsTaken = seatsTaken;
    }

    public ArrayList<BookedSeat> getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(ArrayList<BookedSeat> bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    @Override
    public String toString() {
        return "Viewing{" +
                "id='" + id + '\'' +
                ", screen='" + screen + '\'' +
                ", movie='" + movie + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", seatsTaken=" + seatsTaken +
                ", bookedSeat=" + bookedSeat +
                '}';
    }

}
