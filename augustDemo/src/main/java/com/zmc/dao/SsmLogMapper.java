package com.zmc.dao;

import com.zmc.entity.SsmLog;
import java.util.List;

public interface SsmLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SsmLog record);

    SsmLog selectByPrimaryKey(Integer id);

    List<SsmLog> selectAll();

    int updateByPrimaryKey(SsmLog record);
}