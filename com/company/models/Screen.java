package com.company.models;
import express.database.Model;
import org.dizitart.no2.objects.Id;

import java.util.Arrays;

@Model
public class Screen {

    @Id
    private String id;

    private String name;
    private int seats;
    private int[] seatsPerRow;

    public Screen() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int[] getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(int[] seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }


    @Override
    public String toString() {
        return "Screen{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", seats=" + seats +
                ", seatsPerRow=" + Arrays.toString(seatsPerRow) +
                '}';
    }
}
