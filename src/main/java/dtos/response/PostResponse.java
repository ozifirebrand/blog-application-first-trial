package dtos.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostResponse {
    private String text;
    private String writerName;
    private LocalDateTime localDateTime= LocalDateTime.now();
}
