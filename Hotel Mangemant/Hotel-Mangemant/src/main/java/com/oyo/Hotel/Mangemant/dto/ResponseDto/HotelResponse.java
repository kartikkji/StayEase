package com.oyo.Hotel.Mangemant.dto.ResponseDto;
import lombok.Data;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Data
@Component
@Setter
public class HotelResponse {

    private String name;


    private Integer contactNumber;


    private Boolean status;


    private String address;

}
