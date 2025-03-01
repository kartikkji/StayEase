package com.oyo.Hotel.Mangemant.entity;


import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotel_room_mappings")
public class HotelRoomMappings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "room_id")
    Integer roomId;

    @Column(name = "hotel_id")
    Integer hotelId;

    @Column(name = "total_rooms")
    Integer totalRooms;



}
