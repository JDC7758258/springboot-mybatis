package com.jdc.test.pojo;

public class MeetingRoom {
    private Long id;
    private String roomName;
    private boolean isOccupied;


    public MeetingRoom(Long id, String roomName, boolean isOccupied) {
        this.id = id;
        this.roomName = roomName;
        this.isOccupied = isOccupied;
    }

    @Override
    public String toString() {
        return "MeetingRoom{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", isOccupied=" + isOccupied +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
