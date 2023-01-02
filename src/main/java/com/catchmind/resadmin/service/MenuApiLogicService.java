package com.catchmind.resadmin.service;


import com.catchmind.resadmin.model.entity.Bistro;
import com.catchmind.resadmin.model.entity.Menu;
import com.catchmind.resadmin.model.network.Header;
import com.catchmind.resadmin.model.network.request.MenuApiRequest;
import com.catchmind.resadmin.model.network.response.MenuApiResponse;
import com.catchmind.resadmin.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuApiLogicService extends BaseService<MenuApiRequest, MenuApiResponse, Menu>{

    private final MenuRepository menuRepository;


    private MenuApiResponse response(Menu menu){
        MenuApiResponse menuApiResponse = MenuApiResponse.builder()
                .meIdx(menu.getMeIdx())
                .meName(menu.getMeName())
                .meContent(menu.getMeContent())
                .mePrice(menu.getMePrice())
                .meIdx2(menu.getMeIdx2())
                .regDate(menu.getRegDate())
                .build();
        return menuApiResponse;
    }

    @Override
    public Header<MenuApiResponse> create(Header<MenuApiRequest> request) {
        MenuApiRequest menuApiRequest = request.getData();
        System.out.println(menuApiRequest);
        Menu menu = Menu.builder()
                .meName(menuApiRequest.getMeName())
                .meContent(menuApiRequest.getMeContent())
                .mePrice(menuApiRequest.getMePrice())
                .build();
        Menu newMenu = baseRepository.save(menu);
        return Header.OK(response(newMenu));
    }

    @Override
    public Header<MenuApiResponse> read(Long id) {
        return null;
    }


//        public Header<BistroApiResponse> login(Header<BistroApiRequest> request) {
//        BistroApiRequest bistroApiRequest = request.getData();
//
//        Optional<Bistro> adminUser = bistroRepository.findByUseridAndUserpw(bistroApiRequest.getUserid(), bistroApiRequest.getUserpw());
//        if(!adminUser.isEmpty()){
//            return Header.OK();
//        }
//        return Header.ERROR("아이디 또는 비밀번호 확인");
//    }
//    @Override
//    public Header<BistroApiResponse> read(Long id) {
//        return null;
//    }

//    public Header<BistroApiResponse> read(String userid, String userpw) {
//        return adminUserRepository.findByUseridAndUserpw(userid, userpw).map(
//                users-> response(users)).map(Header::OK).orElseGet(() -> Header.ERROR("아이디 또는 비림번호 화긴")
//        );
//    }
    @Override
    public Header<MenuApiResponse> update(Header<MenuApiRequest> request) {
        return null;
    }


    public Header<MenuApiResponse> delete(Long id) {
       return null;
    }
}