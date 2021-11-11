package dtos.response;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CommentResponsePackage {
    private String text;
    private LocalDateTime time = LocalDateTime.now();
}
