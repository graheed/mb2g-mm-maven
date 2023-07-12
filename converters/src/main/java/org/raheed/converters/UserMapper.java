package org.raheed.converters;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.raheed.domain.UserCommand;
import org.raheed.entities.User;


@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);
}