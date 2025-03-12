package com.cabbuddy.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cabbuddy.booking.entity.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {
}
