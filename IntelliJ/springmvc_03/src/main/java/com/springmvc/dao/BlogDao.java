package com.springmvc.dao;

import com.springmvc.pojo.Blog;
import org.apache.ibatis.annotations.Param;

public interface BlogDao {
    public Blog queryBlogByTitle(@Param("title")String title);
}
