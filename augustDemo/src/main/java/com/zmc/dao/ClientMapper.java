package com.zmc.dao;

import com.zmc.entity.Client;
import java.util.List;

public interface ClientMapper {
    int deleteByPrimaryKey(String clientId);

    int insert(Client record);

    Client selectByPrimaryKey(String clientId);

    List<Client> selectAll();

    int updateByPrimaryKey(Client record);
}