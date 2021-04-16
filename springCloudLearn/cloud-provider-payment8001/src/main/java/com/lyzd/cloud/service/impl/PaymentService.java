package com.lyzd.cloud.service.impl;

import com.lyzd.cloud.dao.PaymentDao;
import com.lyzd.cloud.pojo.Payment;
import com.lyzd.cloud.service.IpaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService implements IpaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
