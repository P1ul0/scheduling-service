package com.api.scheduling.application.core.domain;

import java.util.UUID;

public class SchedulingDomain {

    private UUID id;

    private String name;

    private String Date;

    private  String typeService;

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
            String telephone,
            StatusDomain status,
            UserDomain user
    ) {
        this.id = id;
        this.name = name;
        Date = date;
        this.typeService = typeService;
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
