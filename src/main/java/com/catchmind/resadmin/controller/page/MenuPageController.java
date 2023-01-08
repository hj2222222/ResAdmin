package com.catchmind.resadmin.controller.page;

import com.catchmind.resadmin.model.network.Header;
import com.catchmind.resadmin.model.network.response.MenuApiResponse;
import com.catchmind.resadmin.service.MenuApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class MenuPageController {
    @Autowired
    private MenuApiLogicService menuApiLogicService;
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

    @GetMapping("/menuModify/{meIdx}")
    public ModelAndView menuModify(@PathVariable Long meIdx) {
        ModelAndView view = new ModelAndView("menu_modify");
        Header<MenuApiResponse> api = menuApiLogicService.read(meIdx);
        System.out.println(api);
        view.addObject("api",api.getData());
        return view;
    }

    @DeleteMapping("menuLookUp/{meIdx}")
    public Header<MenuApiResponse> delete(@PathVariable Long id) {
        return menuApiLogicService.delete(id);
    }

}
