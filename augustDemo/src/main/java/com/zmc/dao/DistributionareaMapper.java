package com.zmc.dao;

import com.zmc.entity.Distributionarea;
import java.util.List;

public interface DistributionareaMapper {
    int deleteByPrimaryKey(Integer disAreaId);

    int insert(Distributionarea record);

    Distributionarea selectByPrimaryKey(Integer disAreaId);

    List<Distributionarea> selectAll();

    int updateByPrimaryKey(Distributionarea record);
}