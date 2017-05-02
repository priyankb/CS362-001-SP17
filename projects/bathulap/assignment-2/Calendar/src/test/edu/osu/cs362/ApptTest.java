package edu.osu.cs362;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest{
    @Test
    public void test1(){
        String title = "Rap concert";
        String description = "We boutta' be lit!";
        int startHour = 19;
        int startMin = 30;
        int startDay = 30;
        int startMonth = 5;
        int startYear = 2017;

        Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

        assertTrue(appt.getValid());
        assertEquals(19, appt.getStartHour());
        assertEquals(30, appt.getStartMinute());
        assertEquals(21, appt.getStartDay());
        assertEquals(5, appt.getStartMonth());
        assertEquals(2017, appt.getStartYear());
        assertEquals("Rap concert", appt.getTitle());
        assertEquals("We boutta' be lit!", appt.getDescription());
    }
}
