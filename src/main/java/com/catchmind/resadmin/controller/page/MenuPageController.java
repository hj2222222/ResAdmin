package com.catchmind.resadmin.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class MenuPageController {

    // 메뉴 관리 페이지
    // http://localhost:8888/menuLookUp
    @GetMapping(path = "menuLookUp")
    public ModelAndView menuLookUp(){
        return new ModelAndView("/menuLookUp");
    }

    // 메뉴 등록 페이지
    // http://localhost:8888/regMenu
    @GetMapping(path = "regMenu")
    public ModelAndView regMenu(){
        return new ModelAndView("/reg_menu");
    }

    // 메뉴 수정 페이지
    // http://localhost:8888/menuModify
    @GetMapping(path = "menuModify")
    public ModelAndView menuModify(){
        return new ModelAndView("/menu_modify");
    }
}
