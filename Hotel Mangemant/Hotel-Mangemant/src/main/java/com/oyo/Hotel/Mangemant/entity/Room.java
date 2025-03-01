package com.oyo.Hotel.Mangemant.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oyo.Hotel.Mangemant.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="active")
    private Boolean active;

    @Enumerated(EnumType.STRING)
    @Column(name= "room_type")
    private RoomType roomType;

    @Column(name = "amenities")
    private String amenities;

    @ManyToMany(mappedBy = "roomList")
    @JsonIgnore
    List<Hotel> hotelList = new ArrayList<>();


}
