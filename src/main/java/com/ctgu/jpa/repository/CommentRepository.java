package com.ctgu.jpa.repository;

import com.ctgu.jpa.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
    @Query(nativeQuery = true,value = "select * from t_comments where id=?1")
    Comment findCommentById(Integer id);

    @Modifying
    @Transactional
    @Query(value = "update t_comments c set c.collect=c.collect+1 where c.id=?1")
    Integer updateCollectById(Integer id);

    @Modifying
    @Transactional
    @Query(value = "delete from t_comments where id=?1")
    Integer deleteCommentById(Integer id);
}
