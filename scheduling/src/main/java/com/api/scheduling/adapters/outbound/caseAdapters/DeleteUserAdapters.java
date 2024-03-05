package com.api.scheduling.adapters.outbound.caseAdapters;

import com.api.scheduling.adapters.outbound.repository.UserRepository;
import com.api.scheduling.application.ports.out.DeleteUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DeleteUserAdapters implements DeleteUserPort {

    private final UserRepository userRepository;
    @Override
    public void deleteUserById(UUID userId) {
        userRepository.deleteById(userId);

    }
}
