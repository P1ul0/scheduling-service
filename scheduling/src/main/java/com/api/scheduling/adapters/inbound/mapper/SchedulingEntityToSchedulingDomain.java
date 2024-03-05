package com.api.scheduling.adapters.inbound.mapper;

import com.api.scheduling.adapters.inbound.entity.SchedulingEntity;
import com.api.scheduling.application.core.domain.SchedulingDomain;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SchedulingEntityToSchedulingDomain {
    public SchedulingDomain mapper(SchedulingEntity schedulingEntity) {
        SchedulingDomain schedulingDomain = new SchedulingDomain();
        BeanUtils.copyProperties(schedulingEntity, schedulingDomain);
        return schedulingDomain;
    }
}
