package com.oyo.Hotel.Mangemant.controller;


import com.oyo.Hotel.Mangemant.dto.ResponseDto.HotelResponse;
import com.oyo.Hotel.Mangemant.dto.RequestDto.HotelRequest;
import com.oyo.Hotel.Mangemant.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hotel/v1/")
public class HotelController {

    @Autowired
    HotelService hotelService;

    // add Hotel and return boolean;
    @PostMapping("/set")
    public ResponseEntity<Boolean> addHotel(@RequestBody HotelRequest hotel){

        return hotelService.addHotel(hotel);

    }

    // find hotel by id.
    @GetMapping("/id")
    public ResponseEntity<HotelResponse> getHotel(@RequestParam long id){
        return ResponseEntity.ok(hotelService.getHotelById(id));
    }

    @GetMapping("/name")
    public ResponseEntity<HotelResponse> getHotelByName(@RequestParam String name){
        return ResponseEntity.ok(hotelService.getHotelByName(name));
    }

}
