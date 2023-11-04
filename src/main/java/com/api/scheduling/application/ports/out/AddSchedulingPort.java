package com.api.scheduling.application.ports.out;

import com.api.scheduling.application.core.domain.SchedulingDomain;

import java.util.UUID;

public interface AddSchedulingPort {
    void AddScheduling (UUID userId, SchedulingDomain schedulingDomain);
}
