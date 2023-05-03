package com.capapi.service;


import com.capapi.model.entity.RecordInterfaceInto;

/**
* @author 16173
* @description 针对表【record_interface_into(用户调用接口记录表)】的数据库操作Service
* @createDate 2023-04-30 21:11:44
*/
public interface InnerRecordInterfaceIntoService {

    /**
     * 记录调用接口时间
     * @param recordInterfaceInto
     * @return
     */
    int addRecordInterfaceInto(RecordInterfaceInto recordInterfaceInto);
}
