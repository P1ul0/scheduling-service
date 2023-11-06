package com.api.scheduling.application.core.usecase;

import com.api.scheduling.application.ports.in.AuthUserServicePort;
import com.api.scheduling.application.ports.out.AuthUserPort;

public class AuthUserService implements AuthUserServicePort {

    private final AuthUserPort authUserPort;

    public AuthUserService(AuthUserPort authUserPort) {
        this.authUserPort = authUserPort;
    }

    @Override
    public String authUser(String email, String password) {
        return authUserPort.authUser(email, password);
    }
}
