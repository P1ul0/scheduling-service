package com.api.scheduling.adapters.inbound.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity(name = "user")
@Data
@RequiredArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    private List<ClientEntity> clients;
}
