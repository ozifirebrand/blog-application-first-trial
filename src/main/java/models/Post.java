package models;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Post {
    private List<User> users = new ArrayList<>();
    private Map<Integer, Comment> comments = new HashMap<>();
    private Integer postId;
    private String text;
    private LocalDateTime localDateTime= LocalDateTime.now();
}
