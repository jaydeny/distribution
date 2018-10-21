package com.zmc.dao;

import com.zmc.entity.Distribution;
import java.util.List;

public interface DistributionMapper {
    int deleteByPrimaryKey(Integer distributId);

    int insert(Distribution record);

    Distribution selectByPrimaryKey(Integer distributId);

    List<Distribution> selectAll();

    int updateByPrimaryKey(Distribution record);
}