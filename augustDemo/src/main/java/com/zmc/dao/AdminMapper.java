package com.zmc.dao;

import com.zmc.entity.Admin;
import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(String adminId);

    int insert(Admin record);

    Admin selectByPrimaryKey(String adminId);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
}