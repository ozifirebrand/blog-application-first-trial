package models;

import lombok.Data;

@Data

public class Blog {
    private Post post;
    private User user;
}
