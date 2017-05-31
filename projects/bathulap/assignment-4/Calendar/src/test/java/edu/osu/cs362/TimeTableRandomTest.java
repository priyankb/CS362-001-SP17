package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	long randomseed = System.currentTimeMillis();
	Random random = new Random(randomseed);
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS = 1000;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static Appt createAppt(Random random){
		int minute = ValuesGenerator.getRandomIntBetween(random, -5,30);
		int hour = ValuesGenerator.getRandomIntBetween(random, -5, 30);
		int day = ValuesGenerator.getRandomIntBetween(random, -5, 35);
		int month = ValuesGenerator.getRandomIntBetween(random, -5, 18);
		int year = ValuesGenerator.getRandomIntBetween(random, -1, 2020);

		return new Appt(hour, minute, day, month, year, "", "");
	}
	 @Test
	  public void randomtest()  throws Throwable  {
		 TimeTable myTable = new TimeTable();
		 GregorianCalendar day1 = new GregorianCalendar(2015, 4, 30);
		 GregorianCalendar day2 = new GregorianCalendar(2016, 3, 4);
		 CalDay myDay = new CalDay(new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, 2000, 2017), ValuesGenerator.getRandomIntBetween(random, 1, 12), ValuesGenerator.getRandomIntBetween(random, 1, 28)));
		 Appt appt1 = null;
		 Appt appt2 = null;
		 LinkedList<Appt> appts = new LinkedList<Appt>();


		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 System.out.println("Start testing...");


		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {

			 //System.out.println(" Seed:"+randomseed );


			 for (int i = 0; i < NUM_TESTS; i++) {
			 	LinkedList<Appt> list = new LinkedList<Appt>();
			 	appt1 = TimeTableRandomTest.createAppt(random);
			 	appt2 = TimeTableRandomTest.createAppt(random);

			 	myTable.deleteAppt(appts, appt1);
			 	appts.add(appt1);
			 	myTable.deleteAppt(appts, null);
			 	appts.add(appt2);
			 	myDay.addAppt(appt1);
			 	myDay.addAppt(appt2);
			 	myTable.getApptRange(appts, day1, day2);
			 	myTable.deleteAppt(appts, appt1);
			 	myTable.deleteAppt(null, null);
			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if ((iteration % 10000) == 0 && iteration != 0)
				 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		 }


		 System.out.println("Done testing...");
		 
		 
	 }


	
}
