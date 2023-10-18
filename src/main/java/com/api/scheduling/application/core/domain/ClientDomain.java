package com.api.scheduling.application.core.domain;

import com.api.scheduling.adapters.inbound.entity.UserEntity;
import jakarta.persistence.*;

import java.util.UUID;

public class ClientDomain {

    private UUID id;

    private String name;

    private String Date;

    private  String typeService;

    private  String telephone;

    private UserEntity user;


    public ClientDomain(UUID id, String name, String date, String typeService, String telephone, UserEntity user) {
        this.id = id;
        this.name = name;
        Date = date;
        this.typeService = typeService;
        this.telephone = telephone;
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
