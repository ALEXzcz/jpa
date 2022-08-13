package com.ctgu.jpa.repository;

import com.ctgu.jpa.entity.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class CommentTest {
    @Autowired
    private CommentRepository repository;

    @Test
    public void selectCommentById(){
        Comment result = repository.findCommentById(1001);
        System.out.println(result);
    }

    @Test
    public void updateCollectById(){
        Integer rows = repository.updateCollectById(1001);
        System.out.println(rows);
    }

    @Test
    public void insertCollect(){
        Comment comment = new Comment();
        comment.setCollect(0);
        comment.setContent("hhhhhh,这个好吃");
        comment.setPublishTime(new Date());
        comment.setUserId(2);
        comment.setResourceId(1);
        repository.save(comment);
    }

    @Test
    public void deleteCommentById(){
        repository.deleteCommentById(1006);
    }
}
