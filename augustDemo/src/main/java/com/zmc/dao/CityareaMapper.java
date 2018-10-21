package com.zmc.dao;

import com.zmc.entity.Cityarea;
import java.util.List;

public interface CityareaMapper {
    int deleteByPrimaryKey(String areaId);

    int insert(Cityarea record);

    Cityarea selectByPrimaryKey(String areaId);

    List<Cityarea> selectAll();

    int updateByPrimaryKey(Cityarea record);
}