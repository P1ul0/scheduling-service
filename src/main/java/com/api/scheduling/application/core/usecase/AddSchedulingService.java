package com.api.scheduling.application.core.usecase;

import com.api.scheduling.application.core.domain.SchedulingDomain;
import com.api.scheduling.application.ports.in.AddSchedulingServicePort;
import com.api.scheduling.application.ports.out.AddSchedulingPort;

import java.util.UUID;

public class AddSchedulingService implements AddSchedulingServicePort {

    private final AddSchedulingPort addSchedulingPort;

    public AddSchedulingService(AddSchedulingPort addSchedulingPort) {
        this.addSchedulingPort = addSchedulingPort;
    }

    @Override
    public void addScheduling(UUID userId, SchedulingDomain schedulingDomain) {
        addSchedulingPort.AddScheduling(userId, schedulingDomain);
    }
}
