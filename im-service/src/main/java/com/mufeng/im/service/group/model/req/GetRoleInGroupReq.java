package com.mufeng.im.service.group.model.req;

import com.mufeng.im.common.model.RequestBase;
import lombok.Data;

import java.util.List;

/**
 * @author: mufeng
 * @description:
 **/
@Data
public class GetRoleInGroupReq extends RequestBase {

    private String groupId;

    private List<String> memberId;
}
