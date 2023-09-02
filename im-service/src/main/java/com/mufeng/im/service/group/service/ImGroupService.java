package com.mufeng.im.service.group.service;

import com.mufeng.im.common.ResponseVO;
import com.mufeng.im.service.group.dao.ImGroupEntity;
import com.mufeng.im.service.group.model.req.*;

/**
 * @description:
 * @author: mufeng
 * @version: 1.0
 */
public interface ImGroupService {

    public ResponseVO importGroup(ImportGroupReq req);

    public ResponseVO createGroup(CreateGroupReq req);

    public ResponseVO updateBaseGroupInfo(UpdateGroupReq req);

    public ResponseVO getJoinedGroup(GetJoinedGroupReq req);

    public ResponseVO destroyGroup(DestroyGroupReq req);

    public ResponseVO transferGroup(TransferGroupReq req);

    public ResponseVO<ImGroupEntity> getGroup(String groupId, Integer appId);

    public ResponseVO getGroup(GetGroupReq req);

    public ResponseVO muteGroup(MuteGroupReq req);

}
