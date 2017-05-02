package edu.osu.cs362;
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTableTest{
    @Test
    public void test1(){
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
    public void test2(){
        TimeTable Time = new TimeTable();
        GregorianCalendar date1 = new GregorianCalendar(2017,3,4);
        GregorianCalendar date2 = new GregorianCalendar(2016, 5,4);
        CalDay day = new CalDay(date1);
        Time.getApptRange(day.appts, date1, date2);
        Appt new_appt = new Appt(15,30,2,5,2016, "Lit", "hello");
        assertNotNull(Time);
    }
}
