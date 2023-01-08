//package com.catchmind.resadmin.controller.page;
//
//import com.catchmind.resadmin.model.network.Header;
//import com.catchmind.resadmin.model.network.response.MenuApiResponse;
//import com.catchmind.resadmin.service.MenuApiLogicService;
//import com.catchmind.resadmin.service.ReviewApiLogicService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//@RequestMapping("")
//public class ReviewPageController {
//    @Autowired
//    private ReviewApiLogicService reviewApiLogicService;
//
//    // 리뷰 관리 페이지
//    // http://localhost:8888/reviewLookup
//    @GetMapping(path = "reviewLookUp")
//    public ModelAndView reviewLookup(){
//        return new ModelAndView("/reviewLookUp");
//    }
//
//
//
//    @DeleteMapping("reviewLookUp/{resName}")
//    public Header<MenuApiResponse> delete(@PathVariable String resName) {
//        return null;
//    }
//
//}
