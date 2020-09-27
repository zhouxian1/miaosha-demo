package com.zx.ms.miaosha.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface OrderMapper {
    /**
     * 生成订单
     * @param name
     * @param createTime
     * @return
     */
    @Insert("INSERT INTO `ms`.`seckill_order`(`custname`, `create_time`) VALUES (#{name}, #{createTime});")
    int insertOrder(@Param("name") String name, @Param("createTime") String createTime);
}
