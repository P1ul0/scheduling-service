package com.api.scheduling.adapters.inbound.controller;

import com.api.scheduling.adapters.inbound.entity.UserEntity;
import com.api.scheduling.adapters.inbound.mapper.UserEntityToUserDomain;
import com.api.scheduling.application.core.domain.UserDomain;
import com.api.scheduling.application.ports.in.CreateUserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", produces = "application/json")
@RequiredArgsConstructor
public class UserController {

    private final UserEntityToUserDomain userEntityToUserDomain;

    private final CreateUserServicePort createUserServicePort;
    @PostMapping(value = "/create")
    public String createUser(@RequestBody UserEntity userEntity) {
        UserDomain userDomain = userEntityToUserDomain.mapper(userEntity);

        createUserServicePort.createUser(userDomain);

        return "User created successfully";

    }
}
