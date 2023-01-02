package com.catchmind.resadmin.controller.api;

import com.catchmind.resadmin.controller.CrudController;
import com.catchmind.resadmin.model.entity.Bistro;
import com.catchmind.resadmin.model.network.Header;
import com.catchmind.resadmin.model.network.request.BistroApiRequest;
import com.catchmind.resadmin.model.network.response.BistroApiResponse;
import com.catchmind.resadmin.service.BistroApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")    // http://localhost:8888/api/admin
@RequiredArgsConstructor
public class BistroApiController extends CrudController<BistroApiRequest, BistroApiResponse, Bistro> {

    private final BistroApiLogicService bistroApiLogicService;

    @Override
    @PostMapping("")
    public Header<BistroApiResponse> create(@RequestBody Header<BistroApiRequest> request) {
        return bistroApiLogicService.create(request);
    }

//    @PostMapping("login") // http://localhost:8888/api/admin/login
//    public Header<BistroApiResponse> login(@RequestBody Header<BistroApiRequest> request) {
//        return bistroApiLogicService.login(request);
//    }

    @Override
    public Header<BistroApiResponse> read(Long id) {
        return super.read(id);
    }

    @Override
    public Header<BistroApiResponse> update(Header<BistroApiRequest> request) {
        return super.update(request);
    }

    @Override
    public Header<BistroApiResponse> delete(Long id) {
        return super.delete(id);
    }
}
