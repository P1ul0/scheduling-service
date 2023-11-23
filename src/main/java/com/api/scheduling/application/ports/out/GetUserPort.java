package com.api.scheduling.application.ports.out;

import com.api.scheduling.application.core.domain.UserDomain;

import java.util.UUID;

public interface GetUserPort {

    UserDomain getUser(UUID userId);
}
