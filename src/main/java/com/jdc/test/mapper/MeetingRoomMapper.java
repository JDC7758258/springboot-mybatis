package com.jdc.test.mapper;

import com.jdc.test.pojo.MeetingRoom;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MeetingRoomMapper {

    @Insert("INSERT INTO MeetingRoom (room_name, is_occupied) VALUES (#{roomName}, #{isOccupied})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertMeetingRoom(MeetingRoom meetingRoom);

    @Delete("DELETE FROM MeetingRoom WHERE id = #{id}")
    void deleteMeetingRoomById(Long id);

    @Update("UPDATE MeetingRoom SET room_name = #{roomName}, is_occupied = #{isOccupied} WHERE id = #{id}")
    void updateMeetingRoom(MeetingRoom meetingRoom);

    @Select("SELECT * FROM MeetingRoom WHERE id = #{id}")
    MeetingRoom selectMeetingRoomById(Long id);

    @Select("SELECT * FROM MeetingRoom")
    List<MeetingRoom> selectAllMeetingRooms();

    // 根据名称模糊查询
    @Select("SELECT * FROM MeetingRoom WHERE room_name LIKE CONCAT('%', #{roomName}, '%')")
    List<MeetingRoom> selectMeetingRoomsByName(String roomName);

    // 分页查询
    @Select("SELECT * FROM MeetingRoom LIMIT #{start}, #{pageSize}")
    List<MeetingRoom> selectMeetingRoomsByPage(@Param("start") int start, @Param("pageSize") int pageSize);
}

