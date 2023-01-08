package com.catchmind.resadmin.controller.api;


import com.catchmind.resadmin.controller.CrudController;
import com.catchmind.resadmin.model.entity.ResAdmin;
import com.catchmind.resadmin.model.network.Header;
import com.catchmind.resadmin.model.network.request.ResAdminApiRequest;
import com.catchmind.resadmin.model.network.response.ResAdminApiResponse;
import com.catchmind.resadmin.service.ResAdminApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")    // http://localhost:8888/api/
@RequiredArgsConstructor
public class ResAdminApiController extends CrudController<ResAdminApiRequest, ResAdminApiResponse, ResAdmin> {

    private final ResAdminApiLogicService resAdminApiLogicService;

    @Override
    @PostMapping("")
    public Header<ResAdminApiResponse> create(@RequestBody Header<ResAdminApiRequest> request) {
        return resAdminApiLogicService.create(request);
    }
    @Override
    public Header<ResAdminApiResponse> read(Long id) {
        return super.read(id);
    }

    @Override
    public Header<ResAdminApiResponse> update(Header<ResAdminApiRequest> request) {
        return super.update(request);
    }

    @Override
    public Header<ResAdminApiResponse> delete(Long id) {
        return super.delete(id);
    }

    @PostMapping("/login")
    public Header<ResAdminApiResponse> login(@RequestBody Header<ResAdminApiRequest> request){
        return resAdminApiLogicService.login(request);
    }



}
