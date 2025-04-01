package com.alibaba.sublety.domain.customer.gateway;

import com.alibaba.sublety.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
