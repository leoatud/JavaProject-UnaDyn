package com.springmvc.service;

import com.springmvc.dao.BlogDao;
import com.springmvc.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Blog queryBlogByTitle(String title) {
        return blogDao.queryBlogByTitle(title);
    }
}
