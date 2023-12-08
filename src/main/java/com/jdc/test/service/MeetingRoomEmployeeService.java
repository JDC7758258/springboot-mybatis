package com.jdc.test.service;

import com.jdc.test.mapper.MeetingRoomEmployeeMapper;
import com.jdc.test.pojo.MeetingRoomEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingRoomEmployeeService {

    @Autowired
    private MeetingRoomEmployeeMapper meetingRoomEmployeeMapper;

    public void insertMeetingRoomEmployee(MeetingRoomEmployee meetingRoomEmployee) {
        meetingRoomEmployeeMapper.insertMeetingRoomEmployee(meetingRoomEmployee);
    }

    public void deleteMeetingRoomEmployee(MeetingRoomEmployee meetingRoomEmployee) {
        meetingRoomEmployeeMapper.deleteMeetingRoomEmployee(meetingRoomEmployee);
    }

    public List<MeetingRoomEmployee> getEmployeesByMeetingRoomId(Long meetingRoomId) {
        return meetingRoomEmployeeMapper.selectEmployeesByMeetingRoomId(meetingRoomId);
    }

    public List<MeetingRoomEmployee> getMeetingRoomsByEmployeeId(Long employeeId) {
        return meetingRoomEmployeeMapper.selectMeetingRoomsByEmployeeId(employeeId);
    }


}

