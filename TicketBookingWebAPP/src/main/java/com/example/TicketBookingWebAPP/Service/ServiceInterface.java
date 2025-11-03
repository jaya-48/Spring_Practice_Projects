package com.example.TicketBookingWebAPP.Service;

import com.example.TicketBookingWebAPP.model.Passenger;
import com.example.TicketBookingWebAPP.model.Ticket;

public interface ServiceInterface {
    public Integer registerPassenger(Passenger passenger);
    public Ticket getTicketInfo(Integer tciketno);
}
