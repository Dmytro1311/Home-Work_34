package org.hillel.homework_34.mapp;

import org.hillel.homework_34.dto.auth.UserDto;
import org.hillel.homework_34.entity.User;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDto dto);
    UserDto toDto(User entity);
    List<User> toEntity(List<UserDto> dtos);
    List<UserDto> toDto(List<User> entities);

}
