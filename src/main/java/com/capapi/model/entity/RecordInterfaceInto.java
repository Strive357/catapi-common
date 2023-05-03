package com.capapi.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 用户调用接口记录表
 * @TableName record_interface_into
 */
@TableName(value ="record_interface_into")
@Data
public class RecordInterfaceInto implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 调用用户 id
     */
    private Long userId;

    /**
     * 接口 id
     */
    private Long interfaceInfoId;

    /**
     * 调用时间
     */
    private LocalDateTime invocateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}