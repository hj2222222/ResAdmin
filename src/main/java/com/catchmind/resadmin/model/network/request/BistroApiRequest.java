package com.catchmind.resadmin.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BistroApiRequest {  // 프론트 > 백
    private String bisName;
    private String bisDesc;
    private String bisCategory;
    private String bisRegion;
    private String bisLunch;
    private String bisDinner;
    private String bisConvenience;
}
