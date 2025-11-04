package com.example.TicketBookingApp.Service;

import com.example.TicketBookingApp.Repository.PassengerRepo;
import com.example.TicketBookingApp.model.Passenger;
import com.example.TicketBookingApp.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Lazy
public class PassengerService implements PassengerServiceInterface{
    @Autowired
    private PassengerRepo Prepo;
    public PassengerService(){
        System.out.println("PassengerService bean created");
    }
    @Override
    public Integer RegisterPassenger(Passenger passenger) {
        Passenger no = Prepo.save(passenger);
        return no.getId();
        
    }

    @Override
    public Ticket getTicketInfo(Integer ticketno) {
        Optional<Passenger> details = Prepo.findById(ticketno);
        if(details.isPresent()){
            Passenger PassengerDetails = details.get();
            Ticket ticket=new Ticket();
            ticket.setTicketNumber(PassengerDetails.getId());
            ticket.setArrivalDate(PassengerDetails.getArrivaldate());
            ticket.setDepartureDate(PassengerDetails.getDeparturedate());
            ticket.setDestination(PassengerDetails.getDestination());
            ticket.setSource(PassengerDetails.getSource());
            ticket.setFare(500.0);
            return ticket;

        }
        return null;
    }
}
