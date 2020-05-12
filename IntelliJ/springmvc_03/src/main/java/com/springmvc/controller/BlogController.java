package com.springmvc.controller;

import com.springmvc.pojo.Blog;
import com.springmvc.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
@RequestMapping("/user")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/login/logic")
    public String login(Blog blog, HttpSession session) throws UnsupportedEncodingException {
        Blog rawblog = blogService.queryBlogByTitle(blog.getTitle());

        String msg = URLEncoder.encode("重新输入", "utf-8");
        if (rawblog == null) {
            return "redirect:/user/login/page?msg=wrong password" + msg;
        }
        if (rawblog.getAuthor_id() == blog.getAuthor_id()) {
            //log login suceesful using session
            session.setAttribute("login", true);
            return "index";
        } else {
            return "redirect:/user/login/page?msg=" + msg;
        }
    }

    @RequestMapping("/login/page")
    public String login2() {
        return "forward:/login.jsp";
    }

    @RequestMapping("/delete")
    public String deletePost(){
        return "index";
    }
}
