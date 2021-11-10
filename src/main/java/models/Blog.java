package models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Data
public class Blog {
    private Map<Integer, User> user = new HashMap<>();
    private Map <Integer, Post> post = new HashMap<>();
    private Map <Integer, Post> comments = new HashMap<>();
}
