package com.api.scheduling.adapters.inbound.mapper;

import com.api.scheduling.adapters.inbound.entity.UserEntity;
import com.api.scheduling.application.core.domain.UserDomain;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserEntityToUserDomain {

    public UserDomain mapper(UserEntity userEntity){
        var userDomain = new UserDomain();
        BeanUtils.copyProperties(userEntity, userDomain);
        return userDomain;
    }
}
