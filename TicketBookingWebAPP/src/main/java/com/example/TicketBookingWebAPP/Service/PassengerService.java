package com.example.TicketBookingWebAPP.Service;

import com.example.TicketBookingWebAPP.model.Passenger;
import com.example.TicketBookingWebAPP.model.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;

@Service
public class PassengerService implements ServiceInterface{
    private String url="http://localhost:8083/TicketBookingAPI/API/POST";
    private String url2="http://localhost:8083/TicketBookingAPI/API/GET/{ticketno}";
    @Override
    public Integer registerPassenger(Passenger passenger) {
        //RestTemplate rs=new RestTemplate();
        //ResponseEntity<Integer> Ticketno = rs.postForEntity(url, passenger, Integer.class);
        WebClient wc=WebClient.create();
        Integer tno = wc.post().uri(url).bodyValue(passenger).retrieve().bodyToMono(Integer.class).block();
        return tno;
    }

    @Override
    public Ticket getTicketInfo(Integer tciketno) {
        RestTemplate rs=new RestTemplate();
        ResponseEntity<Ticket> TicketDetails = rs.getForEntity(url2, Ticket.class, tciketno);
        Ticket Ticket = TicketDetails.getBody();
        return Ticket;
    }
}
