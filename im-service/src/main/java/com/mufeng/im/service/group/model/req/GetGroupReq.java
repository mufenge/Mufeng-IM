package com.mufeng.im.service.group.model.req;

import com.mufeng.im.common.model.RequestBase;
import lombok.Data;

/**
 * @author: mufeng
 * @description:
 **/
@Data
public class GetGroupReq extends RequestBase {

    private String groupId;

}
