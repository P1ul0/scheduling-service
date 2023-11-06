package com.api.scheduling.adapters.outbound.caseAdapters;

import com.api.scheduling.adapters.inbound.entity.UserEntity;
import com.api.scheduling.adapters.outbound.repository.UserRepository;
import com.api.scheduling.application.ports.out.AuthUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AuthUserAdapters implements AuthUserPort {

    private final UserRepository userRepository;
    @Override
    public String authUser(String email, String password) {
        UserEntity userEntity = userRepository.findByEmailAndPassword(email, password)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (userEntity.getPassword().equals(password)){
            throw new RuntimeException("Password invalid");
        }
        return "Token: 123456789";
    }
}
