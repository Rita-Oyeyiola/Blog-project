package com.septa.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.septa.blog.model.Blog;
public interface BlogRepository extends JpaRepository<Blog, Long> {
}