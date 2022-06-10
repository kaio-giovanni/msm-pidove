package com.example.msmpidove.msgbroker.listener;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.SendTo;

import com.example.msmpidove.dto.msgbroker.ErrorResponseDto;
import com.example.msmpidove.dto.msgbroker.SuccessResponseDto;
import com.example.msmpidove.dto.user.UserDto;
import com.example.msmpidove.queues.UserQueues;
import com.example.msmpidove.services.UserService;
import com.example.msmpidove.utils.JsonUtils;

@EnableRabbit
@Configuration
public class UserMsgBrokerListener {

    @Autowired
    private UserService service;

    @Bean
    public Queue saveUserQueue() {
        return new Queue(UserQueues.CREATE_USER, false);
    }

    @Bean
    public Queue deleteUserByIdQueue() {
        return new Queue(UserQueues.DELETE_USER_BY_ID, false);
    }

    @Bean
    public Queue findUserByIdQueue() {
        return new Queue(UserQueues.FIND_USER_BY_ID, false);
    }

    @Bean
    public Queue findAllUserQueue() {
        return new Queue(UserQueues.FIND_ALL_USERS, false);
    }

    @RabbitListener(queues = UserQueues.CREATE_USER)
    @SendTo(value = UserQueues.CREATE_USER)
    public String saveUser(String json) {
        try {
            UserDto dto = JsonUtils.fromJson(json, UserDto.class);
            UserDto savedUserDto = new UserDto(service.save(dto));
            SuccessResponseDto response = new SuccessResponseDto(savedUserDto);
            return JsonUtils.toJson(response);
        } catch (Exception ex) {
            ErrorResponseDto response = new ErrorResponseDto(ex);
            return JsonUtils.toJson(response);
        }
    }

}
