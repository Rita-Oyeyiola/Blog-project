package com.septa.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.septa.blog.dto.BlogDTO;
import org.springframework.web.bind.annotation.*;
import com.septa.blog.service.BlogService;
@RestController
@RequestMapping("/api")

public class BlogController {

        private final BlogService blogService;

        public BlogController(BlogService blogService){ this.blogService = blogService;}

        @GetMapping("/hello")
        public String hello () { return "Hello world"; }

        //POST
        @PostMapping (value = "/blog/create")
        public Object CreateBlog(@RequestBody BlogDTO blogDTO) {
            return blogService.CreateBlog(blogDTO);
        }

        //GET
        @GetMapping("/blog")
        public Object GetAllBlog() {
            return blogService.getAllBlogs();
        }

        //PUT
        @PutMapping("patient/{id}")
        public Object UpdateBlog(@RequestBody BlogDTO blogDTO, @PathVariable long id){
            return blogService.UpdatedBlog(blogDTO, id);
        }

        //DELETE
        @DeleteMapping("/patient/{id}")
        public Object DeleteBlog(@PathVariable long id){
            return blogService.DeleteBlog(id);
        }





}
