package org.jaram.Model;

import java.util.Calendar;

import org.jaram.timetable.ViewControl;

public class DateInfo {
	int year;
	int month;
	int date;
	int dayOfWeek;
	Calendar calendar;
	public DateInfo() {
		calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		date = calendar.get(Calendar.DATE);
		dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	}
	public DateInfo(int add) {
		calendar = Calendar.getInstance();
		calendar.set(year, month, date+add);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		date = calendar.get(Calendar.DATE);
		dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	public int getDayOfWeek() {
		return dayOfWeek;
	}
}

