package com.example.TicketBookingApp.Repository;

import com.example.TicketBookingApp.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Integer> {

}
