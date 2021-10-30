package models;

import lombok.Data;

@Data

public class Blog {
    private User user = new User();
}
