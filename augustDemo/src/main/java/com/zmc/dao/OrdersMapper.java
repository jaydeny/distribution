package com.zmc.dao;

import com.zmc.entity.Orders;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Orders record);

    Orders selectByPrimaryKey(String orderId);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
}