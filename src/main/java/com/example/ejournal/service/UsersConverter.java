package com.example.ejournal.service;

import com.example.ejournal.dto.UsersDto;
import com.example.ejournal.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setEmail(usersDto.getEmail());
        users.setName(usersDto.getName());
        users.setLogin(usersDto.getLogin());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {
        return UsersDto.builder()
                .id(users.getId())
                .email(users.getEmail())
                .login(users.getLogin())
                .name(users.getName())
                .build();
    }
}