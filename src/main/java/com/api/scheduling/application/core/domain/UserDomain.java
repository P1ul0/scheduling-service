package com.api.scheduling.application.core.domain;

import java.util.List;
import java.util.UUID;

public class UserDomain {

    private UUID id;
    private String name;
    private String email;
    private String password;
    private List<SchedulingDomain> scheduling;

    public UserDomain() {
    }

    public UserDomain(UUID id, String name, String email, String password, List<SchedulingDomain> scheduling) {
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

    public List<SchedulingDomain> getScheduling() {
        return this.scheduling;
    }

    public void setScheduling(List<SchedulingDomain> scheduling) {
        this.scheduling = scheduling;
    }
}
