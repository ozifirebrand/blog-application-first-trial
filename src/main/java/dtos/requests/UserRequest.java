package dtos.requests;

import lombok.Data;

@Data
public class UserRequest {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String username;
    private String emailAddress;
    private String password;
}
