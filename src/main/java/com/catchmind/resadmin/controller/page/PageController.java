package com.catchmind.resadmin.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    //식당 정보 입력 페이지
    // http://localhost:8888/mypage
    @GetMapping(path = "mypage")
    public ModelAndView mypage(HttpServletRequest request){
        HttpSession session =request.getSession(false);
        String id = null;
        String name = null;

        if(session == null){
            System.out.println("세션이 없습니다.");
            return new ModelAndView("/login");

        }else{
            id = (String)session.getAttribute("id");
            name = (String)session.getAttribute("name");
            System.out.println("세션이 있습니다.");
        }
        return new ModelAndView("/mypage").addObject("id", id).addObject("name",name);
    }
    //식당 상세정보 입력 페이지
    // http://localhost:8888/mypage2
    @GetMapping(path = "mypage2")
    public ModelAndView mypage2(){
        return new ModelAndView("/mypage2");
    }

    //리뷰 조회 페이지
    // http://localhost:8888/reviewLookUp
    @GetMapping(path = "reviewLookUp")
    public ModelAndView reviewLookUp(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        String id = null;
        String name = null;

        if(session == null){
            System.out.println("세션이 없습니다.");
            return new ModelAndView("/login");

        }else{
            id = (String)session.getAttribute("id");
            name = (String)session.getAttribute("name");
            System.out.println("세션이 있습니다.");
        }
        return new ModelAndView("/reviewLookUp")
                .addObject("id", id)
                .addObject("name",name);
    }

    // 매출 페이지
    // http://localhost:8888/salesStatus
    @GetMapping(path = "salesStatus")
    public ModelAndView salesStatus(){
        return new ModelAndView("/sales_status");
    }


}
