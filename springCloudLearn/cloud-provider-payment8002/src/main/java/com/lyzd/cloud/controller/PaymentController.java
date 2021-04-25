package com.lyzd.cloud.controller;

import com.lyzd.cloud.pojo.CommonResult;
import com.lyzd.cloud.pojo.Payment;
import com.lyzd.cloud.service.IpaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private IpaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;//添加serverPort

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        return new CommonResult<>(200, "插入成功", result);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@RequestBody @PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult<>(200, "查询成功,服务端口为:"+serverPort, payment);
        } else {
            return new CommonResult<>(444, "没有对应记录,服务端口为:"+serverPort);
        }
    }
}
