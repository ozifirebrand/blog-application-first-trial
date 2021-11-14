package dtos.requests;

import lombok.Data;

@Data
public class UserInfo {
    private String emailAddress;
    private String password;
}
