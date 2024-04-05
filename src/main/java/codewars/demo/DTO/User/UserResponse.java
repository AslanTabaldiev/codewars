package codewars.demo.DTO.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private Long id;
    private String email;
    private String username;
    private String token;
}
