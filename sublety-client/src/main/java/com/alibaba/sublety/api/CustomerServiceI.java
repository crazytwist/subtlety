package com.alibaba.sublety.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.sublety.dto.CustomerAddCmd;
import com.alibaba.sublety.dto.CustomerListByNameQry;
import com.alibaba.sublety.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
