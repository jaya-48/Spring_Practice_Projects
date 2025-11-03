package com.example.TicketBookingApp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Ticket {
    private static Integer idCounter = 1;
    private Integer id;
    private Integer ticketNumber;
    private String source;
    private String destination;
    private Double fare;
    private Date ArrivalDate;
    private Date DepartureDate;

    public Ticket() {
    }

    public Ticket( Integer ticketNumber, String source, String destination, Double fare, Date arrivalDate, Date departureDate) {
        this.id =idCounter++ ;
        this.ticketNumber = ticketNumber;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        ArrivalDate = arrivalDate;
        DepartureDate = departureDate;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Date getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(Date departureDate) {
        DepartureDate = departureDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", fare=" + fare +
                ", ArrivalDate=" + ArrivalDate +
                ", DepartureDate=" + DepartureDate +
                '}';
    }
}
