package dtos.response;

import lombok.Data;

@Data
public class UserResponse {
    private String username;
    private String lastName;
    private String firstName;
    private int userId;
}
