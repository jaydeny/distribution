package com.zmc.dao;

import com.zmc.entity.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}