package com.api.scheduling.application.core.usecase;

import com.api.scheduling.application.ports.in.DeleteUserServicePort;
import com.api.scheduling.application.ports.out.DeleteUserPort;

import java.util.UUID;

public class DeleteUserService implements DeleteUserServicePort {

    private final DeleteUserPort deleteUserPort;

    public DeleteUserService(DeleteUserPort deleteUserPort) {
        this.deleteUserPort = deleteUserPort;
    }

    @Override
    public void executeDeleteUser(UUID userId) {
        deleteUserPort.deleteUserById(userId);
    }
}
