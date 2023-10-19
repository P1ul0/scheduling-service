package com.api.scheduling.adapters.inbound.mapper;

import com.api.scheduling.adapters.inbound.record.SchedulingRecord;
import com.api.scheduling.application.core.domain.SchedulingDomain;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SchedulingRecordToSchedulingDomain {

    public SchedulingDomain mapper(SchedulingRecord schedulingRecord){
        var schedulingDomain = new SchedulingDomain();
        BeanUtils.copyProperties(schedulingRecord, schedulingDomain);
        return schedulingDomain;
    }
}
