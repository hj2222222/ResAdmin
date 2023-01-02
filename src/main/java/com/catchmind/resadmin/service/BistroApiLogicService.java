package com.catchmind.resadmin.service;


import com.catchmind.resadmin.model.entity.Bistro;
import com.catchmind.resadmin.model.network.Header;
import com.catchmind.resadmin.model.network.request.BistroApiRequest;
import com.catchmind.resadmin.model.network.response.BistroApiResponse;

import com.catchmind.resadmin.repository.BistroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BistroApiLogicService extends BaseService<BistroApiRequest, BistroApiResponse, Bistro>{

    private final BistroRepository bistroRepository;


    private BistroApiResponse response(Bistro bistro){
        BistroApiResponse bistroApiResponse = BistroApiResponse.builder()
                .bisIdx(bistro.getBisIdx())
                .bisName(bistro.getBisName())
                .bisDesc(bistro.getBisDesc())
                .bisCategory(bistro.getBisCategory())
                .bisRegion(bistro.getBisRegion())
                .bisLunch(bistro.getBisLunch())
                .bisDinner(bistro.getBisDinner())
                .bisConvenience(bistro.getBisConvenience())
                .regDate(bistro.getRegDate())
                .build();
        return bistroApiResponse;
    }

    @Override
    public Header<BistroApiResponse> create(Header<BistroApiRequest> request) {
        BistroApiRequest bistroApiRequest = request.getData();

        Bistro bistro = Bistro.builder()
                .bisName(bistroApiRequest.getBisName())
                .bisDesc(bistroApiRequest.getBisDesc())
                .bisCategory(bistroApiRequest.getBisCategory())
                .bisRegion(bistroApiRequest.getBisRegion())
                .bisLunch(bistroApiRequest.getBisLunch())
                .bisDinner(bistroApiRequest.getBisDinner())
                .bisConvenience(bistroApiRequest.getBisConvenience())
                .build();
        Bistro newBistro = baseRepository.save(bistro);
        return Header.OK(response(newBistro));
    }

    @Override
    public Header<BistroApiResponse> read(Long id) {
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
    public Header<BistroApiResponse> update(Header<BistroApiRequest> request) {
        return null;
    }


    public Header<BistroApiResponse> delete(Long id) {
       return null;
    }
}