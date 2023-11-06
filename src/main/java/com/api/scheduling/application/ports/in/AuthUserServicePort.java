package com.api.scheduling.application.ports.in;

public interface AuthUserServicePort {

    String authUser(String email, String password);
}
