package com.api.scheduling.application.ports.in;

import java.util.UUID;

public interface DeleteUserServicePort {
    void executeDeleteUser(UUID userId);
}
