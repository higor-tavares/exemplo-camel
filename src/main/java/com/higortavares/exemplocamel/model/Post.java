package com.higortavares.exemplocamel.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    private Long id;
    private Long userId;
    private String title;
    private String body;
}
