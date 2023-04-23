package com.icwd.hotel.HotelService.repository;

import com.icwd.hotel.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String > {
}
