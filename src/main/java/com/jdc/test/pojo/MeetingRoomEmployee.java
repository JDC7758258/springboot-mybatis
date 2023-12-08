package com.jdc.test.pojo;

public class MeetingRoomEmployee {
    private Long meetingRoomId;
    private Long employeeId;

    public MeetingRoomEmployee(Long meetingRoomId, Long employeeId) {
        this.meetingRoomId = meetingRoomId;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "MeetingRoomEmployee{" +
                "meetingRoomId=" + meetingRoomId +
                ", employeeId=" + employeeId +
                '}';
    }

    public Long getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(Long meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
