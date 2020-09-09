package com.dxc.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
	
 private String roomid;
 private String type;
 private String status;
 private int costperday;
 
 @Id
 
@Column(name="roomid")
public String getRoomid() {
	return roomid;
}
public void setRoomid(String roomid) {
	this.roomid = roomid;
}

@Column(name="type")
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

@Column(name="status")
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

@Column(name="costperday")
public int getCostperday() {
	return costperday;
}
public void setCostperday(int costperday) {
	this.costperday = costperday;
}
 
}
