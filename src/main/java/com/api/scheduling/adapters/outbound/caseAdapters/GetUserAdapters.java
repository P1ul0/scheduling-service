package com.api.scheduling.adapters.outbound.caseAdapters;

import com.api.scheduling.adapters.inbound.mapper.UserDomainToUserEntity;
import com.api.scheduling.adapters.inbound.mapper.UserEntityToUserDomain;
import com.api.scheduling.adapters.outbound.repository.UserRepository;
import com.api.scheduling.application.core.domain.UserDomain;
import com.api.scheduling.application.ports.out.GetUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class GetUserAdapters implements GetUserPort {

    private final UserRepository userRepository;


    private final UserEntityToUserDomain userEntityToUserDomain;

    @Override
    public UserDomain getUser(UUID userId) {
        return userEntityToUserDomain.mapper(userRepository.findById(userId).orElseThrow());
    }
}
