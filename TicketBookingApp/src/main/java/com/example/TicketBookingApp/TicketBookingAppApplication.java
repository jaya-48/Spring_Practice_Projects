package com.example.TicketBookingApp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
        title = "Ticket Booking App API",
        version = "1.0",
        description = "API documentation for Ticket Booking Application"
        ),
        servers=@Server(
                url="http://localhost:8083/TicketBookingAPI",
                description = "This API is deployed in this url"
        )
)
public class TicketBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

}
