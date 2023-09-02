package com.mufeng.im.service.user.service;

import com.mufeng.im.common.ResponseVO;
import com.mufeng.im.service.user.dao.ImUserDataEntity;
import com.mufeng.im.service.user.model.req.*;
import com.mufeng.im.service.user.model.resp.GetUserInfoResp;

/**
 * @description:
 * @author: mufeng
 * @version: 1.0
 */
public interface ImUserService {

    public ResponseVO importUser(ImportUserReq req);

    public ResponseVO<GetUserInfoResp> getUserInfo(GetUserInfoReq req);

    public ResponseVO<ImUserDataEntity> getSingleUserInfo(String userId , Integer appId);

    public ResponseVO deleteUser(DeleteUserReq req);

    public ResponseVO modifyUserInfo(ModifyUserInfoReq req);


}
