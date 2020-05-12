package com.springmvc.service;

import com.springmvc.pojo.Blog;

public interface BlogService {
    public Blog queryBlogByTitle(String title);
}
