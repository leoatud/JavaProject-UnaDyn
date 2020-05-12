package com.springmvc.controller;


import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/index")
    public String index(){
        return "WEB-INF/upload";
    }

    @RequestMapping("/test1")
    public String test1(MultipartFile file, String username) throws IOException {
        String fileName = file.getOriginalFilename();
        file.transferTo(new File("c:\\"+fileName));
        return "index";
    }

    @RequestMapping("/test2")
    public String test2(MultipartFile file, String username, HttpSession session) throws IOException {
        String fileName= UUID.randomUUID().toString();
        String rawFileName= file.getOriginalFilename();
        String extention = FilenameUtils.getExtension(rawFileName);
        String uniqueFileName = fileName+"."+extention;
        String realPath = session.getServletContext().getRealPath("/upload_file");
        System.out.println("ReadPath is:" + realPath);

        file.transferTo(new File(realPath + File.separator + uniqueFileName));
        return "index";
    }
}
