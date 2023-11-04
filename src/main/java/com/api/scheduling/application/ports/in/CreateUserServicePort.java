package com.api.scheduling.application.ports.in;

import com.api.scheduling.application.core.domain.UserDomain;

public interface CreateUserServicePort {
    void createUser(UserDomain userDomain);
}
