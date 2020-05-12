package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/cap", method = RequestMethod.GET)
public class CaptchaController {

    @GetMapping("/index")
    public String index() {
        return "WEB-INF/captcha";
    }
}
