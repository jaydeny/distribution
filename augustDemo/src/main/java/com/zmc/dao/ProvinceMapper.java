package com.zmc.dao;

import com.zmc.entity.Province;
import java.util.List;

public interface ProvinceMapper {
    int deleteByPrimaryKey(String proId);

    int insert(Province record);

    Province selectByPrimaryKey(String proId);

    List<Province> selectAll();

    int updateByPrimaryKey(Province record);
}