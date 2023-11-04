package com.api.scheduling.config;

import com.api.scheduling.adapters.outbound.useCaseAdapters.CreateUserAdapters;
import com.api.scheduling.application.core.usecase.CreateUserService;
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
}
