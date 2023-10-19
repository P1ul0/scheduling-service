package com.api.scheduling.adapters.inbound.mapper;

import com.api.scheduling.adapters.inbound.record.UserRecord;
import com.api.scheduling.application.core.domain.UserDomain;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserRecordToUserDomain {

    public UserDomain mapper(UserRecord userRecord){
        var userDomain = new UserDomain();
        BeanUtils.copyProperties(userRecord, userDomain);
        return userDomain;
    }
}
