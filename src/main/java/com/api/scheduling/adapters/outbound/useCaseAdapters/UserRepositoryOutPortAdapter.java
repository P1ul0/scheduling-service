package com.api.scheduling.adapters.outbound.useCaseAdapters;

import com.api.scheduling.adapters.inbound.entity.UserEntity;
import com.api.scheduling.adapters.outbound.repository.UserRepository;
import com.api.scheduling.application.core.domain.UserDomain;
import com.api.scheduling.application.ports.out.UserRepositoryOutPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UserRepositoryOutPortAdapter implements UserRepositoryOutPort {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    @Override
    public void saveUser(UserDomain userDomain) {
        UserEntity userEntity = this.modelMapper.map(userDomain, UserEntity.class);

        this.userRepository.findByEmail(userEntity.getEmail())
                .orElseThrow(() -> new RuntimeException("User already exists"));

        this.userRepository.save(userEntity);
    }


    @Override
    public UserDomain findByEmail(String email) {
        UserEntity userEntity = this.userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return this.modelMapper.map(userEntity, UserDomain.class);
    }

    @Override
    public UserDomain findById(UUID id) {
        UserEntity userEntity = this.userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return this.modelMapper.map(userEntity, UserDomain.class);
    }

    @Override
    public void updateById(UUID id, UserDomain userDomain) {
        UserEntity userEntity = this.userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        userEntity.setName(userDomain.getName());
        userEntity.setEmail(userDomain.getEmail());
        userEntity.setPassword(userDomain.getPassword());

        this.userRepository.save(userEntity);

    }

    @Override
    public void deleteById(UUID id) {
        UserEntity userEntity = this.userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        this.userRepository.delete(userEntity);
    }
}
