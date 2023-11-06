package com.api.scheduling.adapters.inbound.controller;

import com.api.scheduling.adapters.inbound.entity.SchedulingEntity;
import com.api.scheduling.adapters.inbound.entity.UserEntity;
import com.api.scheduling.adapters.inbound.mapper.SchedulingEntityToSchedulingDomain;
import com.api.scheduling.adapters.inbound.mapper.UserEntityToUserDomain;
import com.api.scheduling.application.core.domain.SchedulingDomain;
import com.api.scheduling.application.core.domain.UserDomain;
import com.api.scheduling.application.ports.in.AddSchedulingServicePort;
import com.api.scheduling.application.ports.in.AuthUserServicePort;
import com.api.scheduling.application.ports.in.CreateUserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/user", produces = "application/json")
@RequiredArgsConstructor
public class UserController {

    private final UserEntityToUserDomain userEntityToUserDomain;

    private final SchedulingEntityToSchedulingDomain schedulingEntityToSchedulingDomain;

    private final CreateUserServicePort createUserServicePort;

    private final AddSchedulingServicePort addSchedulingServicePort;

    private final AuthUserServicePort authUserServicePort;

    @PostMapping(value = "/create")
    public String createUser(@RequestBody UserEntity userEntity) {
        UserDomain userDomain = userEntityToUserDomain.mapper(userEntity);

        createUserServicePort.createUser(userDomain);

        return "User created successfully";
    }

    @PostMapping(value = "/auth")
    public String authUser(@RequestBody String email, String password) {
        return authUserServicePort.authUser(email, password);
    }

    @PutMapping(value = "/addScheduling/{id}")
    public String addScheduling(@PathVariable("id") UUID userId, @RequestBody SchedulingEntity schedulingEntity) {
        SchedulingDomain schedulingDomain = schedulingEntityToSchedulingDomain.mapper(schedulingEntity);

        addSchedulingServicePort.addScheduling(userId, schedulingDomain);

        return "Scheduling added successfully";
    }
}
