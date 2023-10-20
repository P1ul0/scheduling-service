package com.api.scheduling.adapters.inbound.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity(name = "scheduling")
@Data
@RequiredArgsConstructor
public class SchedulingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String Date;

    private  String typeService;

    private  String telephone;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

}
