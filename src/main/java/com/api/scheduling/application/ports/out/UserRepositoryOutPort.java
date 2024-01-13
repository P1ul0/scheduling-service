package com.api.scheduling.application.ports.out;

import com.api.scheduling.application.core.domain.UserDomain;

import java.util.UUID;

public interface UserRepositoryOutPort {

    void saveUser(UserDomain userDomain);

    UserDomain findByEmail(String email);

    UserDomain findById(UUID id);

    void updateById(UUID id, UserDomain userDomain);
    void deleteById(UUID id);
}
