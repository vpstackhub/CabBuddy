# 🚖 CabBuddy - Microservices-Based Ride Booking System

CabBuddy is a microservices-based ride-booking system built with **Spring Boot, Eureka, API Gateway, and MongoDB**.

## 📌 Project Overview
This project demonstrates how to build a **distributed system** using **Spring Cloud Microservices** with:

- **🛠 Tech Stack**: Java, Spring Boot, Spring Cloud, Eureka, API Gateway, MongoDB
- **🔧 Services**:
  - `cabbuddy-api-gateway` (Routes requests)
  - `cabbuddy-passenger-service` (Handles passengers)
  - `cabbuddy-booking-service` (Handles ride bookings)
  - `cabbuddy-eureka-server` (Service discovery)

## 🚀 How to Run
1. **Start Eureka Server** (`cabbuddy-eureka-server`)
2. **Start API Gateway** (`cabbuddy-api-gateway`)
3. **Start Passenger & Booking Services**
4. **Test the APIs** via Postman:
   ```sh
   http://localhost:8080/passenger
   http://localhost:8080/booking
