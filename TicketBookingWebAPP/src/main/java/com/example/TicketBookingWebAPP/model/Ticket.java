package com.example.TicketBookingWebAPP.model;

import java.util.Date;

public class Ticket {
    private Integer id;
    private Integer ticketNumber;
    private String source;
    private String destination;
    private Double fare;
    private Date ArrivalDate;
    private Date DepartureDate;

    public Ticket() {
    }

    public Ticket(Integer id, Integer ticketNumber, String source, String destination, Double fare, Date arrivalDate, Date departureDate) {
        this.id = id;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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
                ", ticketNumber=" + ticketNumber +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", fare=" + fare +
                ", ArrivalDate=" + ArrivalDate +
                ", DepartureDate=" + DepartureDate +
                '}';
    }
}
