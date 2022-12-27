package com.catchmind.resadmin.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class ReservationPageController {

    // 예약 내역 페이지
    // http://localhost:8888/reservation
    @GetMapping(path = "reservation")
    public ModelAndView reservation(){
        return new ModelAndView("/reservation");
    }

    // 예약 캘린더 페이지
    // http://localhost:8888/reservationCalender
    @GetMapping(path = "reservationCalender")
    public ModelAndView reservationCalender(){
        return new ModelAndView("/reservation_calender");
    }

    // 예약 취소 내역 페이지
    // http://localhost:8888/reservationCancel
    @GetMapping(path = "reservationCancel")
    public ModelAndView reservationCancel(){
        return new ModelAndView("/reservation_cancel");
    }





}
