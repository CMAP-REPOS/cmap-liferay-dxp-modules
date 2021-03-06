package com.cmap.portlets.custom.eventslist.model;

public class EventViewModel {
		
    private String date;
    private String time;
    private String title;
    private String description;
    private String location;
    private String appointment;
    
	public EventViewModel(String date, String time, String title, String description,
			String location, String appointment) {
		this.date = date;
		this.time = time;
		this.title = title;
		this.description = description;
		this.location = location;
		this.appointment = appointment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
}
