package com.api.scheduling.application.ports.in;

import com.api.scheduling.application.core.domain.UserDomain;

import java.util.UUID;

public interface GetUserServicePort {

    UserDomain getUser(UUID userId);
}
