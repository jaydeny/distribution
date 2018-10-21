package com.zmc.dao;

import com.zmc.entity.Invoice;
import java.util.List;

public interface InvoiceMapper {
    int deleteByPrimaryKey(Integer invoiceId);

    int insert(Invoice record);

    Invoice selectByPrimaryKey(Integer invoiceId);

    List<Invoice> selectAll();

    int updateByPrimaryKey(Invoice record);
}