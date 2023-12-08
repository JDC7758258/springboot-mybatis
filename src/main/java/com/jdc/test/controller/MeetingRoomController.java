package com.jdc.test.controller;

import com.jdc.test.pojo.MeetingRoom;
import com.jdc.test.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meetingRooms")
public class MeetingRoomController {

    @Autowired
    private MeetingRoomService meetingRoomService;

    @PostMapping
    public void insertMeetingRoom(@RequestBody MeetingRoom meetingRoom) {
        meetingRoomService.insertMeetingRoom(meetingRoom);
    }

    @DeleteMapping("/{id}")
    public void deleteMeetingRoomById(@PathVariable Long id) {
        meetingRoomService.deleteMeetingRoomById(id);
    }

    @PutMapping("/{id}")
    public void updateMeetingRoom(@PathVariable Long id, @RequestBody MeetingRoom meetingRoom) {
        meetingRoom.setId(id);
        meetingRoomService.updateMeetingRoom(meetingRoom);
    }

    @GetMapping("/{id}")
    public MeetingRoom selectMeetingRoomById(@PathVariable Long id) {
        return meetingRoomService.selectMeetingRoomById(id);
    }

    @GetMapping
    public List<MeetingRoom> selectAllMeetingRooms() {
        return meetingRoomService.selectAllMeetingRooms();
    }

    @GetMapping("/search")
    public List<MeetingRoom> selectMeetingRoomsByName(@RequestParam String roomName) {
        return meetingRoomService.selectMeetingRoomsByName(roomName);
    }

    @GetMapping("/page")
    public List<MeetingRoom> selectMeetingRoomsByPage(@RequestParam int start, @RequestParam int pageSize) {
        return meetingRoomService.selectMeetingRoomsByPage(start, pageSize);
    }
}

