package com.sun.dao;

import com.sun.domin.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
