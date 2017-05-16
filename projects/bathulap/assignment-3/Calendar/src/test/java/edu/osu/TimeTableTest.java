package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	@Test
	public void test1() throws Throwable{
		int startHour = 12;
		int startDay = 7;
		int startMonth = 7;
		int startMin = 25;
		int startYear = 2017;

		String title = "Sight seeing";
		String description = "This will be fun";
		Appt appt  = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);
		TimeTable Time = new TimeTable();
		LinkedList<Appt> apps =  new LinkedList<Appt>();
		GregorianCalendar date1 =  new GregorianCalendar(2017,5,4);
		GregorianCalendar date2 = new GregorianCalendar(2017, 7,12);
		assertNotNull(Time.getApptRange(apps, date1, date2));

	}
	@Test
	public void test2() throws Throwable{
		TimeTable Time = new TimeTable();
		GregorianCalendar date1 = new GregorianCalendar(2016,3,4);
		GregorianCalendar date2 = new GregorianCalendar(2017, 5,4);
		CalDay day = new CalDay(date1);
		Time.getApptRange(day.appts, date1, date2);
		Appt new_appt = new Appt(15,30,2,5,2016, "Lit", "hello");
		assertNotNull(Time);
	}
	@Test
	public void test3() throws Throwable {
		TimeTable myTable = new TimeTable();
		GregorianCalendar date1 = new GregorianCalendar(2017, 4, 5);
		GregorianCalendar date2 = new GregorianCalendar(2017, 5, 9);
		GregorianCalendar date3 = new GregorianCalendar(2016, 8, 4);
		CalDay day = new CalDay(date1);
		Appt myAppt = new Appt(15, 20, 3, 4, 2017, "Cool", "Hi");
		day.addAppt(myAppt);
		assertEquals(myAppt.getDescription(), "Hi");
		assertEquals(myAppt.getTitle(), "Cool");
		assertEquals(myAppt.getStartDay(), 3);
		assertEquals(myAppt.getStartMonth(), 4);
		assertEquals(myAppt.getStartHour(), 15);
		assertEquals(myAppt.getStartMinute(), 20);

	}
}
