package com.zmc.dao;

import com.zmc.entity.Car;
import java.util.List;

public interface CarMapper {
    int deleteByPrimaryKey(String carId);

    int insert(Car record);

    Car selectByPrimaryKey(String carId);

    List<Car> selectAll();

    int updateByPrimaryKey(Car record);
}