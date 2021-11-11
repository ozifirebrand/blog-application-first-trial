package dtos.requests;

import lombok.Data;

@Data
public class PostRequest {
    private String text;
    private Integer postId;
    private String writerName;
}
