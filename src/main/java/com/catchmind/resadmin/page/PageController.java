package com.catchmind.resadmin.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class PageController {

    // 식당 관리자 메인페이지
    // http://localhost:8888/index
    @GetMapping(path = "index")
    public ModelAndView index(){
        return new ModelAndView("/index");
    }

    // 식당 일정 관리 캘린더
    // http://localhost:8888/myCalander
    @GetMapping(path = "myCalander")
    public ModelAndView myCalander(){
        return new ModelAndView("/my_calander");
    }

    //식당 정보 수정 페이지
    // http://localhost:8888/mypage
    @GetMapping(path = "mypage")
    public ModelAndView mypage(){
        return new ModelAndView("/mypage");
    }

    //리뷰 조회 페이지
    // http://localhost:8888/reviewLookUp
    @GetMapping(path = "reviewLookUp")
    public ModelAndView reviewLookUp(){
        return new ModelAndView("/reviewLookUp");
    }

    // 매출 페이지
    // http://localhost:8888/salesStatus
    @GetMapping(path = "salesStatus")
    public ModelAndView salesStatus(){
        return new ModelAndView("/sales_status");
    }


}
