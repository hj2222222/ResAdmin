package com.catchmind.resadmin.controller.api;

import com.catchmind.resadmin.controller.CrudController;
import com.catchmind.resadmin.model.entity.Menu;
import com.catchmind.resadmin.model.network.Header;
import com.catchmind.resadmin.model.network.request.MenuApiRequest;
import com.catchmind.resadmin.model.network.response.MenuApiResponse;
import com.catchmind.resadmin.service.MenuApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu")    // http://localhost:8888/api/menu
@RequiredArgsConstructor
public class MenuApiController extends CrudController<MenuApiRequest, MenuApiResponse, Menu> {

    private final MenuApiLogicService menuApiLogicService;

    @Override
    @PostMapping("")
    public Header<MenuApiResponse> create(@RequestBody Header<MenuApiRequest> request) {
        System.out.println("---------------");
        System.out.println(request);
        System.out.println("---------------");
        return menuApiLogicService.create(request);
    }

//    @PostMapping("login") // http://localhost:8888/api/admin/login
//    public Header<BistroApiResponse> login(@RequestBody Header<BistroApiRequest> request) {
//        return bistroApiLogicService.login(request);
//    }

    @Override
    public Header<MenuApiResponse> read(Long id) {
        return super.read(id);
    }

    @Override
    public Header<MenuApiResponse> update(Header<MenuApiRequest> request) {
        return super.update(request);
    }

    @Override
    public Header<MenuApiResponse> delete(Long id) {
        return super.delete(id);
    }
}
