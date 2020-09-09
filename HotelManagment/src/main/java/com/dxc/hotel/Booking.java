package com.dxc.hotel;



import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	
	private String bookiid;
	private String roomiid;
	private String custname;
	private String city;
	private Timestamp bookdate;
	private Timestamp chkdate;
	
	@Id
	
	@Column(name="bookid")
	public String getBookiid() {
		return bookiid;
	}
	public void setBookiid(String bookiid) {
		this.bookiid = bookiid;
	}
	@Column(name="roomid")
	public String getRoomiid() {
		return roomiid;
	}
	public void setRoomiid(String roomiid) {
		this.roomiid = roomiid;
	}
	
	@Column(name="custname")
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	@Column(name="city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name="bookdate")
	public Date getBookdate() {
		return bookdate;
	}
	public void setBookdate(Timestamp bookdate) {
		this.bookdate = bookdate;
	}
	
	@Column(name="chkdate")
	public Date getChkdate() {
		return chkdate;
	}
	public void setChkdate(Timestamp chkdate) {
		this.chkdate = chkdate;
	}
	

}
