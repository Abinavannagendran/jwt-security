package com.example.jwtSecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Builder
@Data
public class Users {
    @Id
    private int id;
    private String username;
    private String password;
}
