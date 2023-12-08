package com.jdc.test.service;

import com.jdc.test.mapper.MeetingRoomMapper;
import com.jdc.test.pojo.MeetingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingRoomService {

    @Autowired
    private MeetingRoomMapper meetingRoomMapper;

    public void insertMeetingRoom(MeetingRoom meetingRoom) {
        meetingRoomMapper.insertMeetingRoom(meetingRoom);
    }

    public void deleteMeetingRoomById(Long id) {
        meetingRoomMapper.deleteMeetingRoomById(id);
    }

    public void updateMeetingRoom(MeetingRoom meetingRoom) {
        meetingRoomMapper.updateMeetingRoom(meetingRoom);
    }

    public MeetingRoom selectMeetingRoomById(Long id) {
        return meetingRoomMapper.selectMeetingRoomById(id);
    }

    public List<MeetingRoom> selectAllMeetingRooms() {
        return meetingRoomMapper.selectAllMeetingRooms();
    }

    public List<MeetingRoom> selectMeetingRoomsByName(String roomName) {
        return meetingRoomMapper.selectMeetingRoomsByName(roomName);
    }

    public List<MeetingRoom> selectMeetingRoomsByPage(int start, int pageSize) {
        return meetingRoomMapper.selectMeetingRoomsByPage(start, pageSize);
    }
}

