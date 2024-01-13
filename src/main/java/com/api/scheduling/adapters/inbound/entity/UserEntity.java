package com.api.scheduling.adapters.inbound.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "users")
@RequiredArgsConstructor
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private UUID id;

    private String name;

    private String email;

    private String password;


}
