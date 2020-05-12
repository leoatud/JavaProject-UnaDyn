package com.springmvc.exresolver;

import com.springmvc.exception.LoginException;
import com.springmvc.exception.PermissionException;
import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class MyExceptionResolver implements HandlerExceptionResolver {
    /**
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        ModelAndView mv = new ModelAndView();
        e.printStackTrace();
        if (e instanceof LoginException) {
            mv.setViewName("redirect:/user/login");
        } else if (e instanceof PermissionException) {
            mv.setViewName("redirect:/user/permission");
        } else {
            mv.setViewName("redirect:/hello/test1");
        }

        return mv;
    }
}
