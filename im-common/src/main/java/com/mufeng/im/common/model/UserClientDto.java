package com.mufeng.im.common.model;

import lombok.Data;

/**
 * @description:
 * @author: mufeng
 * @version: 1.0
 */
@Data
public class UserClientDto {

    private Integer appId;

    private Integer clientType;

    private String userId;

    private String imei;

}
