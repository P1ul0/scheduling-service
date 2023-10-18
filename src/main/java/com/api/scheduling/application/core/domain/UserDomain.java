package com.api.scheduling.application.core.domain;

import java.util.List;
import java.util.UUID;

public class UserDomain {

    private UUID id;
    private String name;
    private String email;
    private String password;
    private List<ClientDomain> scheduling;

    public UserDomain(UUID id, String name, String email, String password, List<ClientDomain> scheduling) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.scheduling = scheduling;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ClientDomain> getClients() {
        return scheduling;
    }

    public void setClients(List<ClientDomain> scheduling) {
        this.scheduling = scheduling;
    }
}
