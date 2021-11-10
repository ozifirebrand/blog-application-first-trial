package models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private User user = new User();
    private LocalDateTime time = LocalDateTime.now();
}
