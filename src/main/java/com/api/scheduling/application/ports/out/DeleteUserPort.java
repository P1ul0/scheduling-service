package com.api.scheduling.application.ports.out;

import java.util.UUID;

public interface DeleteUserPort {
    void deleteUserById(UUID userId);

}
