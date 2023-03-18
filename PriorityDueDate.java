package com.todoproject;

public class PriorityDueDate {
	private int priority;
	private int year;
	private int month;
	private int day;

	public PriorityDueDate(int priority, int year, int month, int day) {
		super();
		this.priority = priority;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "PriorityDueDate [priority=" + priority + ", year=" + year + ", month=" + month + ", day=" + day + "]";
	}


}
