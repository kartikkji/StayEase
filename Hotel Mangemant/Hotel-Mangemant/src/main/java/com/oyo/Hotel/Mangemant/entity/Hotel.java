package com.oyo.Hotel.Mangemant.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotels")
public class Hotel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(name = "hotel_name", nullable = false)
    private String name;

    @Column(name="contact_number")
    private Integer contactNumber;

   @Column(name = "status")
    private Boolean status;

    @Column(name="address")
    private String address;


    @JoinTable(
        name = "hotel_room_mappings",
        joinColumns = @JoinColumn(name = "hotel_id"),
        inverseJoinColumns = @JoinColumn(name = "room_id")
    )

    @ManyToMany
    ArrayList<Room> roomList = new ArrayList<>();

// nothing


}
