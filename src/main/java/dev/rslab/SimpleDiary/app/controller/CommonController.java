package dev.rslab.SimpleDiary.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

    @RequestMapping("/")
    public ModelAndView home(ModelAndView mav){
        mav.setViewName("/common/home");
        return mav;
    }

    @RequestMapping("/secret")
    public ModelAndView secret(ModelAndView mav, HttpServletRequest request){
        String user = request.getRemoteUser();
        String msg = "This is secret page. [login by \"" + user + "\"]";
        mav.setViewName("/common/secret");
        mav.addObject("title", "Secret page");
        mav.addObject("msg", msg);
        return mav;
    }
}
