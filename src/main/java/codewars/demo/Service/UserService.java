package codewars.demo.Service;

import codewars.demo.DTO.User.UserRequest;
import codewars.demo.DTO.User.UserResponse;
import codewars.demo.DTO.Warrior.WarriorRequest;
import codewars.demo.entity.User;

public interface UserService {

    void registration(UserRequest userRequest, WarriorRequest warriorRequest);

    UserResponse login(UserRequest userRequest);

    User getUsernameFromToken(String token);
}
