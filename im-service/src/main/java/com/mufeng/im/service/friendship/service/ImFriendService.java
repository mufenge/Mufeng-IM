package com.mufeng.im.service.friendship.service;

import com.mufeng.im.common.ResponseVO;
import com.mufeng.im.common.model.RequestBase;
import com.mufeng.im.service.friendship.model.req.*;

/**
 * @description:
 * @author: mufeng
 * @version: 1.0
 */
public interface ImFriendService {

    public ResponseVO importFriendShip(ImporFriendShipReq req);

    public ResponseVO addFriend(AddFriendReq req);

    public ResponseVO updateFriend(UpdateFriendReq req);

    public ResponseVO deleteFriend(DeleteFriendReq req);

    public ResponseVO deleteAllFriend(DeleteFriendReq req);

    public ResponseVO getAllFriendShip(GetAllFriendShipReq req);

    public ResponseVO getRelation(GetRelationReq req);

    public ResponseVO doAddFriend(RequestBase requestBase,String fromId, FriendDto dto, Integer appId);

    public ResponseVO checkFriendship(CheckFriendShipReq req);

    public ResponseVO addBlack(AddFriendShipBlackReq req);

    public ResponseVO deleteBlack(DeleteBlackReq req);

    public ResponseVO checkBlck(CheckFriendShipReq req);

}
