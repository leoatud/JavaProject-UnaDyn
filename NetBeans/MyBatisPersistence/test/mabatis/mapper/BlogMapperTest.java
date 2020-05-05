/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mabatis.mapper;

import java.util.List;
import mybatis.pojo.Blog;
import mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import mybatis.mapper.BlogMapperOrigin;

/**
 *
 * @author cliu
 */
public class BlogMapperTest {

   @Test
   public void testSelectBlog() {

      SqlSession session = MyBatisUtil.getSqlSession();

      BlogMapperOrigin blogMapper = session.getMapper(BlogMapperOrigin.class);
      Blog blog = blogMapper.selectBlog(1);

      session.close();

      System.out.println(blog);
   }

   @Test
   public void testSelectBlogByTitle() {
      SqlSession session = MyBatisUtil.getSqlSession();

      BlogMapperOrigin blogMapper = session.getMapper(BlogMapperOrigin.class);
      List<Blog> blog = blogMapper.selectByTitle("%h%");

      session.close();

      for (Blog b : blog) {
         System.out.println(b);
      }
   }

   @Test
   public void testSelectBlogByPage() {
      SqlSession session = MyBatisUtil.getSqlSession();

      BlogMapperOrigin blogMapper = session.getMapper(BlogMapperOrigin.class);
      List<Blog> blog = blogMapper.selectBlogByPage(2, 2, 1, 1);

      session.close();

      for (Blog b : blog) {
         System.out.println(b);
      }
   }

   @Test
   public void testInsertBlog() {
      SqlSession session = MyBatisUtil.getSqlSession();

      BlogMapperOrigin blogMapper = session.getMapper(BlogMapperOrigin.class);

      Blog blog = new Blog("62", 343, "eat", Boolean.TRUE, "u11gly");

      int result = blogMapper.insertBlog(blog);
      System.out.println("result value: " + result);

      session.commit();
      session.close();
   }

   @Test
   public void testUpdateBlog() {
      SqlSession session = MyBatisUtil.getSqlSession();

      BlogMapperOrigin blogMapper = session.getMapper(BlogMapperOrigin.class);

      Blog blog = new Blog("62", 343, "eat", Boolean.TRUE, "u11gly");

      int result = blogMapper.updateBlog(blog);
      System.out.println("result value: " + result);

      session.commit();
      session.close();
   }

   @Test
   public void testSelectBlogNoInterface() {
      SqlSession session = MyBatisUtil.getSqlSession();

      Blog blog = (Blog) session.selectOne("mybatis.mapper.BlogMapper.deleteById", 1); //no need to write interface using this way

      session.close();

      System.out.println(blog);

   }
}
