package com.example.TicketBookingApp.Service;

import com.example.TicketBookingApp.model.Passenger;
import com.example.TicketBookingApp.model.Ticket;

public interface PassengerServiceInterface {
    public Integer RegisterPassenger(Passenger passenger);
    public Ticket getTicketInfo(Integer ticketno);

}
