package com.cabbuddy.passenger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cabbuddy.passenger.entity.Passenger;

public interface PassengerRepository extends MongoRepository<Passenger, String> {
}

