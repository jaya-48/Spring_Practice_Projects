package com.example.TicketBookingApp.Controller;

import com.example.TicketBookingApp.Service.PassengerService;
import com.example.TicketBookingApp.model.Passenger;
import com.example.TicketBookingApp.model.Ticket;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
//@Scope("request")
//@Scope("request")
//@Scope("session")
@Lazy
//@Tag(name="TicketBookingAPIController",description ="This are 2 api endpoints for registering passenger and getting ticket info" )
public class PassengerController {
    @Autowired
    private PassengerService Pservice;
    public PassengerController(){
        System.out.println("PassengerController bean is created");
    }
    @PostMapping("/POST")
    //@Operation(summary = "Post operation",description = "Registering passenger")
    public ResponseEntity<Integer> RegisterPassenger(@RequestBody Passenger passenger){
        Integer ticketnumber = Pservice.RegisterPassenger(passenger);
        return new  ResponseEntity<>(ticketnumber, HttpStatus.ACCEPTED);
    }

    @GetMapping("/GET/{ticketno}")
    //@Operation(summary = "GET Operation",description = "Getting the ticket information")
    public ResponseEntity<Ticket> getTicketInfo(@PathVariable Integer ticketno){
        Ticket Ticket = Pservice.getTicketInfo(ticketno);
        return new ResponseEntity<>(Ticket,HttpStatus.ACCEPTED);
    }
}
