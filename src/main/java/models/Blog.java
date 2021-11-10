package models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Data
public class Blog {
    private Map<Integer, User> Users = new HashMap<>();
    private Map <Integer, Post> Post = new HashMap<>();
}
