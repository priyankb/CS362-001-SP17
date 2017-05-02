package edu.osu.cs362;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalDayTest{
    @Test
    public void intialize(){
    CalDay myDay;
    myDay = new CalDay();
    assertEquals(myDay.iterator(),null);
    assertEquals(myDay.isValid(), false);
    assertEquals("", myDay.toString());

    }
    @Test
    public void appTest(){
        String title = "Rap concert";
        String description = "It's lit!";
        int startHour = 19;
        int startMin = 30;
        int startDay = 21;
        int startMonth = 5;
        int startYear = 2017;
        boolean validDate = false;

        Appt appointment1 = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

        GregorianCalendar date = new GregorianCalendar();
        CalDay day = new CalDay(date);
        assertEquals(0, day.getSizeAppts());
        day.addAppt(appointment1);
        assertEquals(1, day.getSizeAppts());

        Appt appointment2 = new Appt(1,2,4,5,2016,"hype", "LIT");
        day.addAppt(appointment2);
        assertEquals(2, day.getSizeAppts());
        String test = day.toString();
        if(test.contains("Rap concert") && test.contains("hype")){
            validDate = true;
        }
        assertTrue(validDate);



    }
}
