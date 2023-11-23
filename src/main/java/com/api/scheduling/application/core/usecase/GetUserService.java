package com.api.scheduling.application.core.usecase;

import com.api.scheduling.application.core.domain.UserDomain;
import com.api.scheduling.application.ports.in.GetUserServicePort;
import com.api.scheduling.application.ports.out.GetUserPort;

import java.util.UUID;

public class GetUserService implements GetUserServicePort {

    private final GetUserPort getUserPort;

    public GetUserService(GetUserPort getUserPort) {
        this.getUserPort = getUserPort;
    }

    @Override
    public UserDomain getUser(UUID userId) {
        return getUserPort.getUser(userId);
    }
}
