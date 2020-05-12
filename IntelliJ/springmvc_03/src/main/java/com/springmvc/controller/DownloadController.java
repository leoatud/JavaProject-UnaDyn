package com.springmvc.controller;


import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("/download")
public class DownloadController {

    @RequestMapping("/index")
    public String index(){
        return "WEB-INF/download";
    }

    @RequestMapping("/test1")
    public void test1(String name, HttpSession session, HttpServletResponse response) throws IOException {
        String realPath = session.getServletContext().getRealPath("/upload_file");
        String filePath = realPath + File.separator + name;
        response.setHeader("content-disposition", "attachment;filename="+name);

        IOUtils.copy(new FileInputStream(filePath) ,  response.getOutputStream());
    }
}
