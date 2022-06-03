package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;

public interface ICustomerRepository extends IGeneralRepository<Customer>{
// extends 1 interface nào đó của Spring Data JPA sẽ làm cho interface này
    // có đầy đủ các phương thức crud liên quan đến class Customer
    // mọi người cần chuyền vào class và kiểu dữ liệu của khoá chính của class này
}
