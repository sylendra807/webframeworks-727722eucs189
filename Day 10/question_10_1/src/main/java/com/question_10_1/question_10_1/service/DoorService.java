package com.question_10_1.question_10_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question_10_1.question_10_1.model.Door;
import com.question_10_1.question_10_1.repository.DoorRepo;


@Service
public class DoorService {
    @Autowired
    private DoorRepo doorRepo;

    public Door postData(Door door) {
        return doorRepo.save(door);
    }

    public List<Door> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public Door updateDetail(int doorid, Door door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<Door> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<Door> getAllDetails() {

        return doorRepo.findAll();
    }

    public Door getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}