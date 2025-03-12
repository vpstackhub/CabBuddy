package com.cabbuddy.passenger.entity;  

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Document(collection = "passengers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
}
