package com.lyzd.cloud.service;

import com.lyzd.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface IpaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
