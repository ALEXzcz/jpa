package com.ctgu.jpa.repository;

import com.ctgu.jpa.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
    @Query(nativeQuery = true,value = "select * from t_comments where id=?1")
    Comment findCommentById(Integer id);
}
