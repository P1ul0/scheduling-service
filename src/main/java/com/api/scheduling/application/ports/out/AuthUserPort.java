package com.api.scheduling.application.ports.out;

public interface AuthUserPort {

    String authUser(String email, String password);
}
