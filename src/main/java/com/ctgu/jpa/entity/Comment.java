package com.ctgu.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "t_comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer collect;
    private String content;
    @Column(name = "publish_time")
    private Date publishTime;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "resource_id")
    private Integer resourceId;
}