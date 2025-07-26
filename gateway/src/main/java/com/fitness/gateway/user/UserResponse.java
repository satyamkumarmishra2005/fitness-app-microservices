package com.fitness.gateway.user;

import lombok.Data;


import java.time.LocalDateTime;

@Data
public class UserResponse {

    private String id;

    private String email;

    private String KeycloakId;

    private String password;

    private String firstName;

    private String lastName;


   // @CreationTimestamp  // Autopopulated by the database
    private LocalDateTime createdAt;

   // @UpdateTimestamp    // Autopopulated by the database
    private LocalDateTime updatedAt;
}
