package edu.osu.cs362;


import org.junit.Test;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

	/**
	 * Generate Random Tests that tests CalDay Class.
	 */
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS = 1000;
	//LinkedList<Appt> listAppts = new LinkedList<Appt>();

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static String RandomSelectMethod(Random random) {
		String[] methodArray = new String[]{"CalDay", "addAppt", "iterator", "toString", "getSizeAppts"};// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n]; // return the method name
	}

	@Test
	public void randomtest() throws Throwable {
		CalDay myDay = new CalDay();
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing...");


		for (int iteration = 0; elapsed < TestTimeout; iteration++) {

			//long randomseed =10;
			long randomseed = System.currentTimeMillis();
			//System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);

			for (int i = 0; i < NUM_TESTS; i++) {
				String methodName = ApptRandomTest.RandomSelectMethod(random);
				if (methodName.equals("CalDay")) {
					int rand = ValuesGenerator.getRandomIntBetween(random, 0 ,90);
					if(rand > 30){
						int year = ValuesGenerator.getRandomIntBetween(random, 0, 60);
						int month = ValuesGenerator.getRandomIntBetween(random, 0, 11);
						int day = ValuesGenerator.getRandomIntBetween(random, 0, 20);
						myDay = new CalDay(new GregorianCalendar(year, month, day));
					}
				}
				if (methodName.equals("iterator")) {
					int min = ValuesGenerator.getRandomIntBetween(random, -5, 65);
					int hour = ValuesGenerator.getRandomIntBetween(random, -10, 35);
					int day = ValuesGenerator.getRandomIntBetween(random, -5, 35);
					int month = ValuesGenerator.getRandomIntBetween(random, -5, 15);
					int year = ValuesGenerator.getRandomIntBetween(random, -5, 35);
					Appt appointment = new Appt(hour, min, day, month, year, "COD binge", "25 killstreak");
					myDay.iterator();
				}
				if (methodName.equals("addAppt") && myDay.isValid()) {
					int min = ValuesGenerator.getRandomIntBetween(random, -10, 70);
					int hour = ValuesGenerator.getRandomIntBetween(random, -10, 35);
					int day = ValuesGenerator.getRandomIntBetween(random, -5, 35);
					int month = ValuesGenerator.getRandomIntBetween(random, -5, 15);
					int year = ValuesGenerator.getRandomIntBetween(random, -5, 35);
					Appt appointment = new Appt(hour, min, day, month, year, "Woot", "We outchea");
					myDay.addAppt(appointment);
				}
				if (methodName.equals("getSizeAppts") && myDay.isValid()) {
					int min = ValuesGenerator.getRandomIntBetween(random, -10, 70);
					int hour = ValuesGenerator.getRandomIntBetween(random, -10, 35);
					int day = ValuesGenerator.getRandomIntBetween(random, -5, 35);
					int month = ValuesGenerator.getRandomIntBetween(random, -5, 15);
					int year = ValuesGenerator.getRandomIntBetween(random, -5, 35);
					Appt appointment = new Appt(hour, min, day, month, year, "Lit", "I have fun");
					myDay.addAppt(appointment);
					myDay.getSizeAppts();
				}
				if (methodName.equals("toString")) {
					int min = ValuesGenerator.getRandomIntBetween(random, -10, 70);
					int hour = ValuesGenerator.getRandomIntBetween(random, -10, 35);
					int day = ValuesGenerator.getRandomIntBetween(random, -5, 35);
					int month = ValuesGenerator.getRandomIntBetween(random, -5, 15);
					int year = ValuesGenerator.getRandomIntBetween(random, -5, 35);
					Appt appointment = new Appt(hour, min, day, month, year, "B-Day", "It's lit!");
					myDay.addAppt(appointment);
					myDay.toString();
				}

			}

			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration % 10000) == 0 && iteration != 0)
				System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		}


		System.out.println("Done testing...");
	}
}
