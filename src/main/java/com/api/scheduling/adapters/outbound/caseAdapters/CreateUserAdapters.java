package com.api.scheduling.adapters.outbound.caseAdapters;

import com.api.scheduling.adapters.inbound.mapper.UserDomainToUserEntity;
import com.api.scheduling.adapters.inbound.mapper.UserEntityToUserDomain;
import com.api.scheduling.adapters.outbound.repository.UserRepository;
import com.api.scheduling.application.core.domain.UserDomain;
import com.api.scheduling.application.ports.out.CreateUserPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserAdapters implements CreateUserPort {
    
    private final UserRepository userRepository;
    
    private final UserDomainToUserEntity userDomainToUserEntity;

    private final UserEntityToUserDomain userEntityToUserDomain;

    @Override
    @Transactional
    public void createUser(UserDomain userDomain) {
        var userEntity = userDomainToUserEntity.mapper(userDomain);
        userEntityToUserDomain.mapper(userRepository.save(userEntity));
    }
}
