package com.zmc.dao;

import com.zmc.entity.LagouPosition;
import java.util.List;

public interface LagouPositionMapper {
    int insert(LagouPosition record);

    List<LagouPosition> selectAll();
}