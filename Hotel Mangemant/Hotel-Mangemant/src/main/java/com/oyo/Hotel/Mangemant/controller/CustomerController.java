package com.oyo.Hotel.Mangemant.controller;


import com.oyo.Hotel.Mangemant.dto.RequestDto.CustomerRequest;
import com.oyo.Hotel.Mangemant.dto.ResponseDto.CustomerResponse;
import com.oyo.Hotel.Mangemant.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<Boolean> createCustomer(@RequestBody CustomerRequest customer){

        Boolean success = customerService.createCustomer(customer);

        return new ResponseEntity<>(success , HttpStatus.CREATED);
    }

    @GetMapping("/Id")
    public ResponseEntity<CustomerResponse> getCustomerDetails(@RequestParam long Id){
        return ResponseEntity.ok(customerService.getCustomerDetails(Id));
    }

}
