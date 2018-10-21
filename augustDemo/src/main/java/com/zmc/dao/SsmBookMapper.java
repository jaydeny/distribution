package com.zmc.dao;

import com.zmc.entity.SsmBook;
import java.util.List;

public interface SsmBookMapper {
    int deleteByPrimaryKey(Integer bookid);

    int insert(SsmBook record);

    SsmBook selectByPrimaryKey(Integer bookid);

    List<SsmBook> selectAll();

    int updateByPrimaryKey(SsmBook record);
}