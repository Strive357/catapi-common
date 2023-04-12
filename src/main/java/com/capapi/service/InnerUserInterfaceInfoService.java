package com.capapi.service;


import com.capapi.model.entity.User;

/**
* 内部用户接口服务
*/
public interface InnerUserInterfaceInfoService  {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId,long userId);

}
