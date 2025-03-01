package com.oyo.Hotel.Mangemant.service;


import com.oyo.Hotel.Mangemant.dto.RequestDto.CustomerRequest;
import com.oyo.Hotel.Mangemant.dto.ResponseDto.CustomerResponse;
import com.oyo.Hotel.Mangemant.entity.Customer;
import com.oyo.Hotel.Mangemant.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public Boolean createCustomer(CustomerRequest customer){
        customerRepo.save(customerRequestDtoToCustomer(customer));
        return true;
    }


    public Customer customerRequestDtoToCustomer(CustomerRequest customerRequest){
      Customer customer = new Customer();
      customer.setName(customerRequest.getName());
      customer.setEmail(customerRequest.getEmail());
      customer.setPhoneNumber(customerRequest.getPhoneNumber());

      return customer;

    }

    public CustomerResponse getCustomerDetails(Long customerId){
        Customer customer = customerRepo.getReferenceById(customerId);

        return CustomerToCustomerResponse(customer);

    }


    public CustomerResponse CustomerToCustomerResponse(Customer customer){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setId(customer.getId());
        customerResponse.setName(customer.getName());
        customerResponse.setEmail(customer.getEmail());
        customerResponse.setPhoneNumber(customer.getPhoneNumber());

        return customerResponse;

    }
}
