package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping("/test1")
    public String test1(HttpServletRequest request, HttpSession session){

        request.setAttribute("name", "chen");
        session.setAttribute("age", 20);
        return "data";
    }

    @RequestMapping("/test2")
    public String test2(Model model, HttpSession session){
        model.addAttribute("name", "boy");
        session.setAttribute("age", 20);
        System.out.println("accessing /data/test2");
        return "data";
    }

    @RequestMapping("/test3")
    public ModelAndView test3(){
        ModelAndView mv =  new ModelAndView();
        mv.setViewName("forward:/data.jsp");
        mv.addObject("name", "phoebe");
        return mv;
    }
}
