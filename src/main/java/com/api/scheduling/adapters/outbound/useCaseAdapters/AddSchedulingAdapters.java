package com.api.scheduling.adapters.outbound.useCaseAdapters;

import com.api.scheduling.adapters.inbound.entity.SchedulingEntity;
import com.api.scheduling.adapters.inbound.mapper.SchedulingDomainToSchedulingEntity;
import com.api.scheduling.adapters.outbound.repository.UserRepository;
import com.api.scheduling.application.core.domain.SchedulingDomain;
import com.api.scheduling.application.ports.out.AddSchedulingPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class AddSchedulingAdapters implements AddSchedulingPort {

    private final UserRepository userRepository;

    private final SchedulingDomainToSchedulingEntity schedulingDomainToSchedulingEntity;

    @Override
    public void AddScheduling(UUID userId, SchedulingDomain schedulingDomain) {
        userRepository.findById(userId).ifPresent(user -> {
            List<SchedulingEntity> schedulingEntityList = user.getScheduling();

            SchedulingEntity schedulingEntity = schedulingDomainToSchedulingEntity.mapper(schedulingDomain);
            schedulingEntity.setUser(user);

            schedulingEntityList.add(schedulingEntity);
            user.setScheduling(schedulingEntityList);

            userRepository.save(user);
        });

    }
}
