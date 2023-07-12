package org.raheed.controllers;

import org.raheed.converters.UserMapper;
import org.raheed.domain.UserCommand;
import org.raheed.entities.User;


public class UserController {
    User saveUser (UserCommand command) {

        return UserMapper.INSTANCE.userCommandToUser( command );

    }
}
