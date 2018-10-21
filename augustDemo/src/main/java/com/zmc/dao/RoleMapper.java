package com.zmc.dao;

import com.zmc.entity.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(Role record);

    Role selectByPrimaryKey(String roleId);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}