package com.example.TicketBookingWebAPP.Controller;

import com.example.TicketBookingWebAPP.Service.PassengerService;
import com.example.TicketBookingWebAPP.model.Passenger;
import com.example.TicketBookingWebAPP.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PassengerController {
    @Autowired
    private PassengerService pservice;
    @PostMapping("/Post")
    public ResponseEntity<Integer> register(@RequestBody Passenger passenger){
        Integer Number = pservice.registerPassenger(passenger);
        return new ResponseEntity<>(Number, HttpStatus.OK);
    }
    @GetMapping("/Get/{tciketno}")
    public ResponseEntity<Ticket> getTicket(@PathVariable Integer tciketno){
        Ticket Ticket1 = pservice.getTicketInfo(tciketno);
        return new ResponseEntity<>(Ticket1, HttpStatus.OK);
    }
}
