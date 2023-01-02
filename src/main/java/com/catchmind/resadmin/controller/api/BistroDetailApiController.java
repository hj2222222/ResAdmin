package com.catchmind.resadmin.controller.api;

import com.catchmind.resadmin.controller.CrudController;
import com.catchmind.resadmin.model.entity.Bistro;
import com.catchmind.resadmin.model.entity.BistroDetail;
import com.catchmind.resadmin.model.network.Header;
import com.catchmind.resadmin.model.network.request.BistroApiRequest;
import com.catchmind.resadmin.model.network.request.BistroDetailApiRequest;
import com.catchmind.resadmin.model.network.response.BistroApiResponse;
import com.catchmind.resadmin.model.network.response.BistroDetailApiResponse;
import com.catchmind.resadmin.service.BistroApiLogicService;
import com.catchmind.resadmin.service.BistroDetailApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin2")    // http://localhost:8888/api/admin2
@RequiredArgsConstructor
public class BistroDetailApiController extends CrudController<BistroDetailApiRequest, BistroDetailApiResponse, BistroDetail> {

    private final BistroDetailApiLogicService bistroDetailApiLogicService;

    @Override
    @PostMapping("")
    public Header<BistroDetailApiResponse> create(@RequestBody Header<BistroDetailApiRequest> request) {
        return bistroDetailApiLogicService.create(request);
    }

//    @PostMapping("login") // http://localhost:8888/api/admin/login
//    public Header<BistroApiResponse> login(@RequestBody Header<BistroApiRequest> request) {
//        return bistroApiLogicService.login(request);
//    }

    @Override
    public Header<BistroDetailApiResponse> read(Long id) {
        return super.read(id);
    }

    @Override
    public Header<BistroDetailApiResponse> update(Header<BistroDetailApiRequest> request) {
        return super.update(request);
    }

    @Override
    public Header<BistroDetailApiResponse> delete(Long id) {
        return super.delete(id);
    }
}
