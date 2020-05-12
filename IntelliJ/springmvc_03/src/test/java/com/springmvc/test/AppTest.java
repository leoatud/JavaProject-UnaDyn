package com.springmvc.test;

import com.springmvc.dao.BlogDao;
import com.springmvc.pojo.Blog;
import com.springmvc.service.BlogService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void testDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BlogDao dao = (BlogDao) context.getBean("blogDao", BlogDao.class);

        System.out.println(dao.queryBlogByTitle("duoduo"));
    }

    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BlogService service = (BlogService) context.getBean("blogServiceImpl", BlogService.class);

        System.out.println(service.queryBlogByTitle("duoduo"));
    }
}
