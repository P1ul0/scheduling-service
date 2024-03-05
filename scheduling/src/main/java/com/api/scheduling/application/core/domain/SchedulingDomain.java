package com.api.scheduling.application.core.domain;

import java.util.UUID;

public class SchedulingDomain {

    private UUID id;

    private String name;

    private String date;

    private  String typeService;

    private double price;

    private  String telephone;

    private StatusDomain status;

    private UserDomain user;

    public SchedulingDomain() {
    }

    public SchedulingDomain(
            UUID id,
            String name,
            String date,
            String typeService,
            double price,
            String telephone,
            StatusDomain status,
            UserDomain user
    ) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.typeService = typeService;
        this.price = price;
        this.telephone = telephone;
        this.status = status;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public StatusDomain getStatus() {
        return status;
    }

    public void setStatus(StatusDomain status) {
        this.status = status;
    }

    public UserDomain getUser() {
        return user;
    }

    public void setUser(UserDomain user) {
        this.user = user;
    }
}
