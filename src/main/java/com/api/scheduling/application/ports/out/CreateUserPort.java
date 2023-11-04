package com.api.scheduling.application.ports.out;

import com.api.scheduling.application.core.domain.UserDomain;

public interface CreateUserPort {
    UserDomain createUser(UserDomain userDomain);
}
