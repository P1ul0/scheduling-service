package com.api.scheduling.adapters.inbound.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity(name = "schedulings")
@Data
@RequiredArgsConstructor
public class SchedulingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String Date;

    private  String typeService;

    private double price;

    private  String telephone;

    private StatusEnum status;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

}
