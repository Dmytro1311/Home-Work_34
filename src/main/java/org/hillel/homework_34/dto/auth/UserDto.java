package org.hillel.homework_34.dto.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter

@NoArgsConstructor
public class UserDto {

    private int id;
    private String name;
    private String password;
    private String role;
}
