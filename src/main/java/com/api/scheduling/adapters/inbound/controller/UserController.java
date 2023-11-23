package com.api.scheduling.adapters.inbound.controller;

import com.api.scheduling.adapters.inbound.entity.SchedulingEntity;
import com.api.scheduling.adapters.inbound.entity.UserEntity;
import com.api.scheduling.adapters.inbound.mapper.SchedulingEntityToSchedulingDomain;
import com.api.scheduling.adapters.inbound.mapper.UserDomainToUserEntity;
import com.api.scheduling.adapters.inbound.mapper.UserEntityToUserDomain;
import com.api.scheduling.application.core.domain.SchedulingDomain;
import com.api.scheduling.application.core.domain.UserDomain;
import com.api.scheduling.application.ports.in.AddSchedulingServicePort;
import com.api.scheduling.application.ports.in.CreateUserServicePort;
import com.api.scheduling.application.ports.in.DeleteUserServicePort;
import com.api.scheduling.application.ports.in.GetUserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/user", produces = "application/json")
@RequiredArgsConstructor
public class UserController {

    private final UserEntityToUserDomain userEntityToUserDomain;

    private final UserDomainToUserEntity userDomainToUserEntity;

    private final SchedulingEntityToSchedulingDomain schedulingEntityToSchedulingDomain;

    private final CreateUserServicePort createUserServicePort;

    private final GetUserServicePort getUserServicePort;

    private final DeleteUserServicePort deleteUserServicePort;

    private final AddSchedulingServicePort addSchedulingServicePort;

    @PostMapping(value = "/create")
    public String createUser(@RequestBody UserEntity userEntity) {
        UserDomain userDomain = userEntityToUserDomain.mapper(userEntity);

        createUserServicePort.createUser(userDomain);

        return "User created successfully";
    }

    @GetMapping(value = "/{id}")
    public UserEntity getUser(@PathVariable("id") UUID userId) {
        return userDomainToUserEntity.mapper(getUserServicePort.getUser(userId));
    }

    @DeleteMapping(value = "/{id}")
    public String deleteUser(@PathVariable("id") UUID userId) {

        deleteUserServicePort.executeDeleteUser(userId);
        return "User deleted successfully";
    }


    @PutMapping(value = "/addScheduling/{id}")
    public String addScheduling(@PathVariable("id") UUID userId, @RequestBody SchedulingEntity schedulingEntity) {
        SchedulingDomain schedulingDomain = schedulingEntityToSchedulingDomain.mapper(schedulingEntity);

        addSchedulingServicePort.addScheduling(userId, schedulingDomain);

        return "Scheduling added successfully";
    }
}
