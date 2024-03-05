package com.api.scheduling.application.ports.in;

import com.api.scheduling.application.core.domain.SchedulingDomain;

import java.util.UUID;

public interface AddSchedulingServicePort {
    void addScheduling(UUID userId, SchedulingDomain schedulingDomain);
}
