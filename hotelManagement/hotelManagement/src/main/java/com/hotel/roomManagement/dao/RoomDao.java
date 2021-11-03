package com.hotel.roomManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.roomManagement.entity.Room;

@Repository
public interface RoomDao extends JpaRepository<Room, Integer> {

}
