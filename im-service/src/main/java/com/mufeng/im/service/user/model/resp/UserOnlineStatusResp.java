package com.mufeng.im.service.user.model.resp;

import com.mufeng.im.common.model.UserSession;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: mufeng
 * @version: 1.0
 */
@Data
public class UserOnlineStatusResp {

    private List<UserSession> session;

    private String customText;

    private Integer customStatus;

}
