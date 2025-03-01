package com.oyo.Hotel.Mangemant.service;


import com.oyo.Hotel.Mangemant.dto.ResponseDto.HotelResponse;
import com.oyo.Hotel.Mangemant.dto.RequestDto.HotelRequest;
import com.oyo.Hotel.Mangemant.entity.Hotel;
import com.oyo.Hotel.Mangemant.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class HotelService {




    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    HotelRequest hotelRequest;

    @Autowired
    HotelResponse hotelResponse;




    public Boolean addHotel(HotelRequest hotel){
        hotelRepository.save(setDtoToEntity(hotel));
        return true;
    }


    public Hotel setDtoToEntity(HotelRequest hotel){
        Hotel hotelEntity = new Hotel();
        hotelEntity.setName(hotel.getName());
        hotelEntity.setAddress(hotel.getAddress());
        hotelEntity.setContactNumber(hotel.getContactNumber());
        hotelEntity.setStatus(hotel.getStatus());
        return hotelEntity;
    }


    public HotelResponse getHotelById(long id) {

        Hotel hotelEntity = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: " + id));
        return setResDtoToEntity(hotelEntity);
    }

    public HotelResponse setResDtoToEntity(Hotel hotelEntity){
        hotelResponse.setName(hotelEntity.getName());
        hotelResponse.setAddress(hotelEntity.getAddress());
        hotelResponse.setContactNumber(hotelEntity.getContactNumber());
        hotelResponse.setStatus(hotelEntity.getStatus());
        return hotelResponse;
    }

    public HotelResponse getHotelByName(String name){
        Hotel hotelEntity = hotelRepository.getByName(name);

        return setResDtoToEntity(hotelEntity);

    }

}
