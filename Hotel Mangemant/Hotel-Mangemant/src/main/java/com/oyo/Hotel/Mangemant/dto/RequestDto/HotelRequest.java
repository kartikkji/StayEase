package com.oyo.Hotel.Mangemant.dto.RequestDto;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component

public class HotelRequest {


    private String name;


    private Integer contactNumber;


    private Boolean status;


    private String address;


}
