package com.api.scheduling.adapters.outbound.repository;

import com.api.scheduling.adapters.inbound.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
