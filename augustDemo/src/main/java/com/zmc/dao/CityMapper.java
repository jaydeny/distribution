package com.zmc.dao;

import com.zmc.entity.City;
import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(String cityId);

    int insert(City record);

    City selectByPrimaryKey(String cityId);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}