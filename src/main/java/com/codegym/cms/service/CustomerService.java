package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Autowired    // gọi repository tương ứng ra từ Spring Container, như mọi người thấy, các phương thức được repo cung cấp sẵn

    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }// iterable là lớp cha của các collection trong java

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }
    //optional là kiểu dữ liệu đặc biệt, có thể kiểm tra dữ liệu là null hay không

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
    // phương thức save này sẽ kiểm tra xem đối tượng truyền vào có id tồn tại chưa,
    // rồi thì cập nhật
    // chưa thì thêm mới
    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
