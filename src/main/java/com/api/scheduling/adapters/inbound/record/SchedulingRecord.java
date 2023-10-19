package com.api.scheduling.adapters.inbound.record;

import com.api.scheduling.application.core.domain.SchedulingDomain;

public record SchedulingRecord(
        String name,
        String date,
        String typeService,
        String telephone
) {
}
