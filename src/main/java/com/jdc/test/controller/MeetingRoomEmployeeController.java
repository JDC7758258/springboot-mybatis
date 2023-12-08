package com.jdc.test.controller;

import com.jdc.test.pojo.MeetingRoomEmployee;
import com.jdc.test.service.MeetingRoomEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meetingRoomEmployees")
public class MeetingRoomEmployeeController {

    @Autowired
    private MeetingRoomEmployeeService meetingRoomEmployeeService;

    @PostMapping
    public void insertMeetingRoomEmployee(@RequestBody MeetingRoomEmployee meetingRoomEmployee) {
        meetingRoomEmployeeService.insertMeetingRoomEmployee(meetingRoomEmployee);
    }

    @DeleteMapping
    public void deleteMeetingRoomEmployee(@RequestBody MeetingRoomEmployee meetingRoomEmployee) {
        meetingRoomEmployeeService.deleteMeetingRoomEmployee(meetingRoomEmployee);
    }

    @GetMapping("/employees/{meetingRoomId}")
    public List<MeetingRoomEmployee> getEmployeesByMeetingRoomId(@PathVariable Long meetingRoomId) {
        return meetingRoomEmployeeService.getEmployeesByMeetingRoomId(meetingRoomId);
    }

    @GetMapping("/meetingRooms/{employeeId}")
    public List<MeetingRoomEmployee> getMeetingRoomsByEmployeeId(@PathVariable Long employeeId) {
        return meetingRoomEmployeeService.getMeetingRoomsByEmployeeId(employeeId);
    }

}

