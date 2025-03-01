package com.oyo.Hotel.Mangemant.repo;

import com.oyo.Hotel.Mangemant.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
