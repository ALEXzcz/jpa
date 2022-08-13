package com.ctgu.jpa.repository;

import com.ctgu.jpa.entity.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentTest {
    @Autowired
    private CommentRepository repository;

    @Test
    public void selectCommentById(){
        Comment result = repository.findCommentById(1001);
        System.out.println(result);
    }
}
