package com.api.scheduling.application.ports.out;

import com.api.scheduling.application.core.domain.UserDomain;

public interface CreateUserPort {
    void createUser(UserDomain userDomain);
}
