package com.capapi.service;


import com.capapi.model.entity.InterfaceInfo;

/**
 * 内部接口服务
*
*/
public interface InnerInterfaceInfoService  {

    /**
     * 根据url和请求方法查询接口信息
     * @param url
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfoByUrl(String url,String method);
}
