package com.api.scheduling.adapters.inbound.mapper;

import com.api.scheduling.adapters.inbound.entity.UserEntity;
import com.api.scheduling.application.core.domain.UserDomain;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserDomainToUserEntity {

    public UserEntity mapper(UserDomain userDomain){
        var userEntity = new UserEntity();
        BeanUtils.copyProperties(userDomain, userEntity);
        return userEntity;
    }
}
