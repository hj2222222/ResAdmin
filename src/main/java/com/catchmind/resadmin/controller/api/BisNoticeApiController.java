package com.catchmind.resadmin.controller.api;

import com.catchmind.resadmin.dto.BisNoticeDto;
import com.catchmind.resadmin.service.BisNoticeApiLogicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SessionAttributes("id")
//@RequestMapping("/api/bisNotice")    // http://localhost:8888/api/menu
//@RequiredArgsConstructor      // private final BisNoticeApiLogicService bisNoticeApiLogicService;
public class BisNoticeApiController {

    private BisNoticeApiLogicService bisNoticeApiLogicService;

    public BisNoticeApiController(BisNoticeApiLogicService bisNoticeApiLogicService){
        this.bisNoticeApiLogicService = bisNoticeApiLogicService;
    }

    @GetMapping("/resNotice")
    public String list(Model model) {
        List<BisNoticeDto> bisNoticeDtoList = bisNoticeApiLogicService.getNoticeList();
        model.addAttribute("postList", bisNoticeDtoList);
        return "/res_notice.html";
    }



    @PostMapping("/resNoticeWrite")
    public String write(BisNoticeDto bisNoticeDto) {
        bisNoticeApiLogicService.savePost(bisNoticeDto);
       return "redirect:/resNotice";
    }

    @GetMapping("/resNoticeWrite")
    public String post(HttpServletRequest request){
        return "/res_notice_write.html";
    }

    @GetMapping("/resNoticeWrite/{binIdx}")
    public String detail(@PathVariable("binIdx") Long binIdx, Model model){
        BisNoticeDto bisNoticeDto = bisNoticeApiLogicService.getPost(binIdx);
        model.addAttribute("notice", bisNoticeDto);
        return "res_notice_write_detail.html";
    }

    @GetMapping("/resNoticeWriteModify/{binIdx}")
    public String modify(@PathVariable("binIdx") Long binIdx, Model model){
        BisNoticeDto bisNoticeDto = bisNoticeApiLogicService.getPost(binIdx);
        model.addAttribute("notice", bisNoticeDto);
        return "res_notice_write_modify.html";
    }

    @PutMapping("/resNoticeWriteModify/{binIdx}")
    public  String update(BisNoticeDto bisNoticeDto) {
        bisNoticeApiLogicService.savePost(bisNoticeDto);
        return "redirect:/resNotice";
    }

    @DeleteMapping("/resNoticeWrite/{binIdx}")
    public String delete(@PathVariable("binIdx") Long binIdx) {
        bisNoticeApiLogicService.deletePost(binIdx);
        return "redirect:/resNotice";
    }

//    @Override
//    @PostMapping("")
//    public Header<BisNoticeApiResponse> create(@RequestBody Header<BisNoticeApiRequest> request) {
//        System.out.println("---------------");
//        System.out.println(request);
//        System.out.println("---------------");
//        return bisNoticeApiLogicService.create(request);
//    }
//
//    @GetMapping("") // http://localhost:8888/api/menu?page=1
//    public Header<List<BisNoticeApiResponse>> findAll(@PageableDefault(sort = {"binIdx"}, direction= Sort.Direction.DESC) Pageable pageable){
//        return bisNoticeApiLogicService.search(pageable);
//    }



}
