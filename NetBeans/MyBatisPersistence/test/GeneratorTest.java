
import mybatis.mapper.BlogMapper;
import mybatis.pojo.Blog;
import mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cliu
 */
public class GeneratorTest {

   @Test
   public void testInsert() {
      SqlSession session = MyBatisUtil.getSqlSession();
      BlogMapper blogMapper = session.getMapper(BlogMapper.class);

      Blog blog = new Blog();
      blog.setId(777);
      blog.setAuthorId(999);
      blog.setFeatured((byte) 0);
      blog.setState("fuckc");
      blog.setTitle("why");

      int count = blogMapper.insert(blog);

      System.out.println("executeeee: " + count);
      session.commit();
      session.close();

   }

   @Test
   public void testDelete() {
      SqlSession session = MyBatisUtil.getSqlSession();
      BlogMapper blogMapper = session.getMapper(BlogMapper.class);

      int count = blogMapper.deleteByPrimaryKey(2);

      System.out.println("executeeee: " + count);
      session.commit();
      session.close();

   }

   @Test
   public void testSelectBlogCacheLevelOne() {
      SqlSession session = MyBatisUtil.getSqlSession();
      BlogMapper blogMapper = session.getMapper(BlogMapper.class);

      Blog blog1 = blogMapper.selectByPrimaryKey(3);
      System.out.println("blog1: " + blog1);

      blog1.setAuthorId(222);
      int result = blogMapper.updateByPrimaryKey(blog1);

      Blog blog2 = blogMapper.selectByPrimaryKey(3);
      System.out.println("blog2: " + blog2);

      session.commit();
      session.close();

   }
}
