package com.dxc.hotel;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




public class RoomCrud {
	
	
	public List<Room> showRoom() {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Room");
		List<Room> rlist = q.list();
		return rlist;
	}
	
	
	
	public String addBooking(Booking booking) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		String bid = generateRoomId();
		booking.setRoomiid(bid);
	    Room r = new Room();
	    r.setStatus("Booked");
	    s.update(r);
		s.save(booking);
	
		t.commit();
		return "Booking done sucessfuly...";
	}
	
	public List<String> available() {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		String cmd = ("select roomid from Room where status='Available'");
		Query q = s.createQuery(cmd);
		List<String> lst = q.list();
		return lst;
	}
	
	
	public String generateBookId() {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Booking");
		List<Booking> blist = q.list();
		String code="";
		String result = "B001";
		if(blist.size()>0) {
		for (Booking book : blist) {
			code = book.getBookiid();
		}
		int id = Integer.parseInt(code.substring(1));
		id++;
		
		if (id >= 1 && id <= 9) {
			result = "B00"+id;
		}
		if (id >=10 && id <= 99) {
			result = "B0" +id;
		}
		if (id >=100 && id <=999) {
			result = "B"+id;
		}	
	}
		return result;
	}
	
	
	public String generateRoomId() {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Room");
		List<Room> rlist = q.list();
		String code="";
		String result = "R001";
		if(rlist.size()>0) {
		for (Room room : rlist) {
			code = room.getRoomid();
		}
		int id = Integer.parseInt(code.substring(1));
		id++;
		
		if (id >= 1 && id <= 9) {
			result = "R00"+id;
		}
		if (id >=10 && id <= 99) {
			result = "R0" +id;
		}
		if (id >=100 && id <=999) {
			result = "R"+id;
		}	
	}
		return result;
	}
	
	public String addRoom(Room room) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		String rid = generateRoomId();
		room.setRoomid(rid);
		s.save(room);
		t.commit();
		return "Room Added Successfully...";
	}
	


	/*	
	public String roomCheckDate(String bookId,Date chkdate) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		Booking b= new Booking();
		b.setChkdate(chkdate);
		s.save(b);
		t.commit();
		return "Checkout Complete";
	}
	
	/*public String roomStatusChange(String bookId){
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		Booking b = new Booking(bookId);
		String rid=b.getRoomiid();
		Room r= new Room();
		String roomid= r.getRoomid();
		r.setStatus("Available");
t.commit();
return r.getStatus();
		
	}*/
}
