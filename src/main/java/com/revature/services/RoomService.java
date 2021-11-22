package com.revature.services;

import java.util.List;
import java.util.NoSuchElementException;

import com.revature.models.Room;
import com.revature.repositories.RoomRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private RoomRepo roomRepo;

    @Autowired
    public RoomService(RoomRepo roomRepo){
        super();
        this.roomRepo = roomRepo;
    }

    public List<Room> findAll(){
        return roomRepo.findAll();
    }

    public Room findById(int id){
        try{
            return roomRepo.findById(id).get();
        } catch (NoSuchElementException e){
            e.printStackTrace();
            return null;
        }
    }
    
}
