package com.cabbuddy.booking.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;
import java.time.LocalDateTime;
import com.cabbuddy.passenger.entity.Passenger; 

@Document(collection = "bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    private String id;
    private Passenger passenger;  
    private String pickupLocation;
    private String dropoffLocation;
    private LocalDateTime bookingTime;
}

