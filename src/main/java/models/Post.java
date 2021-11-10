package models;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Post {
    private Integer postId;
    private String text;
    private LocalDateTime localDateTime= LocalDateTime.now();
}
