package com.zmc.dao;

import com.zmc.entity.Delivery;
import java.util.List;

public interface DeliveryMapper {
    int deleteByPrimaryKey(String deliveryId);

    int insert(Delivery record);

    Delivery selectByPrimaryKey(String deliveryId);

    List<Delivery> selectAll();

    int updateByPrimaryKey(Delivery record);
}