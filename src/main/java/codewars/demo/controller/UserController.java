package codewars.demo.controller;

import codewars.demo.DTO.User.UserRequest;
import codewars.demo.DTO.User.UserResponse;
import codewars.demo.DTO.Warrior.WarriorRequest;
import codewars.demo.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/registration")
    public void registration(@RequestBody UserRequest userRequest, @RequestBody WarriorRequest warriorRequest) {
        userService.registration(userRequest, warriorRequest);
    }

    @PostMapping("/login")
    public UserResponse login(UserRequest userRequest) {
        return userService.login(userRequest);
    }
}
