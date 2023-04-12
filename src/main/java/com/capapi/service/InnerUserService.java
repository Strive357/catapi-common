package com.capapi.service;


import com.capapi.model.entity.User;

/**
 * 内部用户服务
 *
 *
 */
public interface InnerUserService {

    /**
     * 根据公钥查询用户信息
     * @param accessKey
     * @return
     */
    User getUserByAccessKey(String accessKey);

}
