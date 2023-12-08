package com.jdc.test.mapper;

import com.jdc.test.pojo.MeetingRoomEmployee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MeetingRoomEmployeeMapper {

    @Insert("INSERT INTO MeetingRoom_Employee (meeting_room_id, employee_id) VALUES (#{meetingRoomId}, #{employeeId})")
    void insertMeetingRoomEmployee(MeetingRoomEmployee meetingRoomEmployee);

    @Delete("DELETE FROM MeetingRoom_Employee WHERE meeting_room_id = #{meetingRoomId} AND employee_id = #{employeeId}")
    void deleteMeetingRoomEmployee(MeetingRoomEmployee meetingRoomEmployee);

    //根据会议室ID查询关联的员工列表
    @Select("SELECT * FROM MeetingRoom_Employee WHERE meeting_room_id = #{meetingRoomId}")
    List<MeetingRoomEmployee> selectEmployeesByMeetingRoomId(Long meetingRoomId);

    //根据员工ID查询关联的会议室列表
    @Select("SELECT * FROM MeetingRoom_Employee WHERE employee_id = #{employeeId}")
    List<MeetingRoomEmployee> selectMeetingRoomsByEmployeeId(Long employeeId);


}

