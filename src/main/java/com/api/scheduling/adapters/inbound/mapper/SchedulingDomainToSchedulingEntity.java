package com.api.scheduling.adapters.inbound.mapper;

import com.api.scheduling.adapters.inbound.entity.SchedulingEntity;
import com.api.scheduling.application.core.domain.SchedulingDomain;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SchedulingDomainToSchedulingEntity {

    public SchedulingEntity mapper(SchedulingDomain schedulingDomain){
        var schedulingEntity = new SchedulingEntity();
        BeanUtils.copyProperties(schedulingEntity, schedulingDomain);
        return schedulingEntity;
    }
}
