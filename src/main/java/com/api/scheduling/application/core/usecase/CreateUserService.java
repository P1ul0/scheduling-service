package com.api.scheduling.application.core.usecase;

import com.api.scheduling.application.core.domain.UserDomain;
import com.api.scheduling.application.ports.in.CreateUserServicePort;
import com.api.scheduling.application.ports.out.CreateUserPort;

public class CreateUserService implements CreateUserServicePort {

    private final CreateUserPort createUserPort;

    public CreateUserService(CreateUserPort createUserPort) {
        this.createUserPort = createUserPort;
    }


    @Override
    public void createUser(UserDomain userDomain) {
         createUserPort.createUser(userDomain);
    }
}
