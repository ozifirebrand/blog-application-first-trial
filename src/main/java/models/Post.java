package models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Post {
    private String writerName;
    private Integer postId;
    private String text;
    private LocalDateTime localDateTime= LocalDateTime.now();
    List<Comment> comments = new ArrayList<>();
}
