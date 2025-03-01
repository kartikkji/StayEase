package com.oyo.Hotel.Mangemant.repo;


import com.oyo.Hotel.Mangemant.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    Hotel getByName(String name);

    Optional<Hotel> findById(Long id);
}
