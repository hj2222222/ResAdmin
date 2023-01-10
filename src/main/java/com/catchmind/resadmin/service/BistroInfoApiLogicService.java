package com.catchmind.resadmin.service;


import com.catchmind.resadmin.model.entity.BistroInfo;
import com.catchmind.resadmin.model.network.Header;
import com.catchmind.resadmin.model.network.request.BistroInfoApiRequest;
import com.catchmind.resadmin.model.network.response.BistroInfoApiResponse;
import com.catchmind.resadmin.repository.BistroInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BistroInfoApiLogicService extends BaseService<BistroInfoApiRequest, BistroInfoApiResponse, BistroInfo>{

    private final BistroInfoRepository bistroInfoRepository;


    private BistroInfoApiResponse response(BistroInfo bistroInfo){
        BistroInfoApiResponse bistroInfoApiResponse = BistroInfoApiResponse.builder()
                .bisIdx(bistroInfo.getBisIdx())
                .resaBisName(bistroInfo.getResaBisName())
                .bisDesc(bistroInfo.getBisDesc())
                .bisCategory(bistroInfo.getBisCategory())
                .bisRegion(bistroInfo.getBisRegion())
                .bisLunch(bistroInfo.getBisLunch())
                .bisDinner(bistroInfo.getBisDinner())
                .bisConvenience(bistroInfo.getBisConvenience())
                .regDate(bistroInfo.getRegDate())
                .build();
        return bistroInfoApiResponse;
    }

    @Override
    public Header<BistroInfoApiResponse> create(Header<BistroInfoApiRequest> request) {
        BistroInfoApiRequest bistroInfoApiRequest = request.getData();
        BistroInfo bistroInfo = BistroInfo.builder()
                .resaBisName(bistroInfoApiRequest.getResaBisName())
                .bisDesc(bistroInfoApiRequest.getBisDesc())
                .bisCategory(bistroInfoApiRequest.getBisCategory())
                .bisRegion(bistroInfoApiRequest.getBisRegion())
                .bisLunch(bistroInfoApiRequest.getBisLunch())
                .bisDinner(bistroInfoApiRequest.getBisDinner())
                .bisConvenience(bistroInfoApiRequest.getBisConvenience())
                .build();
        BistroInfo newBistroInfo = baseRepository.save(bistroInfo);
        return Header.OK(response(newBistroInfo));
    }

    @Override
    public Header<BistroInfoApiResponse> read(Long id) {
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
    public Header<BistroInfoApiResponse> update(Header<BistroInfoApiRequest> request) {
        return null;
    }


    public Header<BistroInfoApiResponse> delete(Long id) {
       return null;
    }
}