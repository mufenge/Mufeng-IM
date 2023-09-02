package com.mufeng.im.service.friendship.service;

import com.mufeng.im.common.ResponseVO;
import com.mufeng.im.service.friendship.dao.ImFriendShipGroupEntity;
import com.mufeng.im.service.friendship.model.req.AddFriendShipGroupReq;
import com.mufeng.im.service.friendship.model.req.DeleteFriendShipGroupReq;

/**
 * @author: mufeng
 * @description:
 **/
public interface ImFriendShipGroupService {

    public ResponseVO addGroup(AddFriendShipGroupReq req);

    public ResponseVO deleteGroup(DeleteFriendShipGroupReq req);

    public ResponseVO<ImFriendShipGroupEntity> getGroup(String fromId, String groupName, Integer appId);


}
