package br.com.rocketjava.todolist.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserModel {
    private String username;
    private String name;
    private String password;

}
