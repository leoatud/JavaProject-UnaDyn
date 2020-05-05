/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mapper;

import java.util.List;
import mybatis.pojo.Blog;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author cliu
 */
public interface BlogMapper {

   Blog selectBlog(Integer id);

   List<Blog> selectByTitle(String title);

   List<Blog> selectBlogByPage(
           @Param(value = "offset") int offset,
           @Param(value = "pagesize") int pagesize,
           int p1, int p2);

   int insertBlog(Blog blog);

   int updateBlog(Blog blog);

   int deleteBlogById(Integer id);
}
