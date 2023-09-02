package com.mufeng.im.service.user.model.req;

import com.mufeng.im.common.model.RequestBase;
import com.mufeng.im.service.user.dao.ImUserDataEntity;
import lombok.Data;

import java.util.List;


@Data
public class ImportUserReq extends RequestBase {

    private List<ImUserDataEntity> userData;


}
