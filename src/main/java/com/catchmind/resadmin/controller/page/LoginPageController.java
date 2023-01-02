package com.catchmind.resadmin.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class LoginPageController {

    // 로그인 페이지
    // http://localhost:8888/login
    @GetMapping(path = "login")
    public ModelAndView login(){
        return new ModelAndView("/login");
    }

    // 비밀번호 찾기
    // http://localhost:8888/passwordChange
    @GetMapping(path = "passwordChange")
    public ModelAndView passwordChange(){
        return new ModelAndView("/password_change");
    }

    // 초기값 비밀번호 변경 페이지
    // http://localhost:8888/rePassword
    @GetMapping(path = "rePassword")
    public ModelAndView rePassword(){
        return new ModelAndView("/re_password");
    }

    // 비밀번호 수정 페이지
    // http://localhost:8888/myModify
    @GetMapping(path = "myModify")
    public ModelAndView myModify(){
        return new ModelAndView("/my_modify");
    }

}
