package com.api.scheduling.adapters.inbound.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity(name = "users")
@Data
@RequiredArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    private List<SchedulingEntity> scheduling;

}
