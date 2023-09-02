package com.mufeng.im.service.friendship.service;

import com.mufeng.im.common.ResponseVO;
import com.mufeng.im.service.friendship.model.req.AddFriendShipGroupMemberReq;
import com.mufeng.im.service.friendship.model.req.DeleteFriendShipGroupMemberReq;

/**
 * @author: mufeng
 * @description:
 **/
public interface ImFriendShipGroupMemberService {

    public ResponseVO addGroupMember(AddFriendShipGroupMemberReq req);

    public ResponseVO delGroupMember(DeleteFriendShipGroupMemberReq req);

    public int doAddGroupMember(Long groupId, String toId);

    public int clearGroupMember(Long groupId);
}
