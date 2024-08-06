package com.sp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.app.domain.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long>{
	
}
