package models;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Comment {

    private Integer commentId;
    private String commentText;
    private LocalDateTime time = LocalDateTime.now();
}
