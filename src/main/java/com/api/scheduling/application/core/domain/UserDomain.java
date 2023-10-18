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
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ClientDomain> getScheduling() {
        return this.scheduling;
    }

    public void setScheduling(List<ClientDomain> scheduling) {
        this.scheduling = scheduling;
    }
}
