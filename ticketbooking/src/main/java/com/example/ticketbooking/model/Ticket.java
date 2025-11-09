package com.example.ticketbooking.model;

import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String event;
    private int seats;
    private String date;

    public Ticket() {}

    public Ticket(String name, String event, int seats, String date) {
        this.name = name;
        this.event = event;
        this.seats = seats;
        this.date = date;
    }

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEvent() { return event; }
    public void setEvent(String event) { this.event = event; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
