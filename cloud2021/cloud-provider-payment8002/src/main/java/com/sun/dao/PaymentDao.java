package com.sun.dao;

import com.sun.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther zzyy
 * @create 2020-02-18 10:27
 */
@Repository
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

    List<Payment> getPaymentList();
}
