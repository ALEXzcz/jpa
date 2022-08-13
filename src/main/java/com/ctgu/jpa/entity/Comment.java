package com.ctgu.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "t_comments")
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private Integer collect;
    @Column(name = "resource_id")
    private Integer resourceId;
    @Column(name = "user_id")
    private Integer userId;
    private Date publishTime;
}
