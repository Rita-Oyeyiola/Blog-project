package com.septa.blog.service;

import com.septa.blog.repository.BlogRepository;
import org.springframework.stereotype.Service;
import com.septa.blog.dto.BlogDTO;
import com.septa.blog.model.Blog;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService (BlogRepository blogRepository){ this.blogRepository = blogRepository; }

    public Object CreateBlog(BlogDTO blogDTO){
        Blog blog = new Blog();

        blog.setId(blogDTO.getId());
        blog.setTitle(blog.getTitle());
        blog.setContent(blogDTO.getContent());
        blog.setDateCreated(blogDTO.getDateCreated());
        blog.setDateUpdated(blog.getDateUpdated());

        return blogRepository.save(blog);
    }

    public Object getAllBlogs() {
        return blogRepository.findAll();
    }

    public Object UpdatedBlog (BlogDTO blogDTO, long id) {

        Blog blog = blogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found"));

        blog.setId(blogDTO.getId());
        blog.setTitle(blog.getTitle());
        blog.setContent(blogDTO.getContent());
        blog.setDateCreated(blogDTO.getDateCreated());
        blog.setDateUpdated(blog.getDateUpdated());

        return blogRepository.save(blog);

    }

    public Object DeleteBlog(long id){

        Blog blog = blogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found"));

        blogRepository.delete(blog);
        return "Blog has been deleted";
    }




}
