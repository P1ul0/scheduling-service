package com.api.scheduling.config;

import com.api.scheduling.adapters.outbound.caseAdapters.AddSchedulingAdapters;
import com.api.scheduling.adapters.outbound.caseAdapters.CreateUserAdapters;
import com.api.scheduling.adapters.outbound.caseAdapters.DeleteUserAdapters;
import com.api.scheduling.adapters.outbound.caseAdapters.GetUserAdapters;
import com.api.scheduling.application.core.usecase.AddSchedulingService;
import com.api.scheduling.application.core.usecase.CreateUserService;
import com.api.scheduling.application.core.usecase.DeleteUserService;
import com.api.scheduling.application.core.usecase.GetUserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);

        return modelMapper;
    }

    @Bean
    public CreateUserService createUserService(CreateUserAdapters createUserAdapters) {
        return new CreateUserService(createUserAdapters);
    }

    @Bean
    public AddSchedulingService addSchedulingService(AddSchedulingAdapters addSchedulingAdapters) {
        return new AddSchedulingService(addSchedulingAdapters);
    }

    @Bean
    public GetUserService getUserService(GetUserAdapters getUserAdapters) {
        return new GetUserService(getUserAdapters);
    }

    @Bean
    public DeleteUserService deleteUserService(DeleteUserAdapters deleteUserAdapters) {
        return new DeleteUserService(deleteUserAdapters);
    }

}
