package com.hotel.roomManagement.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hotel.roomManagement.dao.RoomDao;
import com.hotel.roomManagement.entity.Room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class RoomController {
	
	@Autowired
	private RoomDao roomDao;
	
	
	@RequestMapping(value="/rooms", method=RequestMethod.GET)
    public List<Room> getRooms() {
        return roomDao.findAll();
    }
	
	@PostMapping(value = "/rooms")
	public void addRoom(@RequestBody Room room) {
		roomDao.save(room);
	}

}
