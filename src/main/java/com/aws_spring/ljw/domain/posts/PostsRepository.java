package com.aws_spring.ljw.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//db layer 접근자
public interface PostsRepository extends JpaRepository<Posts,Long> {

}
