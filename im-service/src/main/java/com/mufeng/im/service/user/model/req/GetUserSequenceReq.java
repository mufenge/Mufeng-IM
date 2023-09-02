package com.mufeng.im.service.user.model.req;

import com.mufeng.im.common.model.RequestBase;
import lombok.Data;

/**
 * @description:
 * @author: mufeng
 * @version: 1.0
 */
@Data
public class GetUserSequenceReq extends RequestBase {

    private String userId;

}
