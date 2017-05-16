package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.*/

	 @Test
	  public void test01()  throws Throwable  {
		 String title = "Rap concert";
		 String description = "We boutta' be lit!";
		 int startHour = 1;
		 int startMin = 0;
		 int startDay = 1;
		 int startMonth = 5;
		 int startYear = 2017;

		 Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);
         /*if(appt.getValid()){
             assertEquals(appt.toString(), null);
         }*/
		 assertTrue(appt.getValid());
		 assertEquals(1, appt.getStartHour());
		 assertEquals(0, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(5, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Rap concert", appt.getTitle());
		 assertEquals("We boutta' be lit!", appt.getDescription());
	 }

	@Test
	public void test02()  throws Throwable  {
		String title = "Graduation";
		String description = "Can't believe we here!";
		int startHour = 23;
		int startMin = 59;
		int startDay = 31;
		int startMonth = 12;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(23, appt.getStartHour());
		assertEquals(59, appt.getStartMinute());
		assertEquals(31, appt.getStartDay());
		assertEquals(12, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Graduation", appt.getTitle());
		assertEquals("Can't believe we here!", appt.getDescription());
		//assertFalse(appt.getValid());
	 }
	@Test
	public void test03()  throws Throwable  {
		String title = "Birthday party";
		String description = "Finally 21!";
		int startHour = 11;
		int startMin = 22;
		int startDay = 3;
		int startMonth = 8;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(11, appt.getStartHour());
		assertEquals(22, appt.getStartMinute());
		assertEquals(3, appt.getStartDay());
		assertEquals(8, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday party", appt.getTitle());
		assertEquals("Finally 21!", appt.getDescription());
		//assertFalse(appt.getValid());
	}
	@Test
	public void test04()  throws Throwable  {
		String title = "Dog's funeral";
		String description = "Poor doggo!";
		int startHour = 21;
		int startMin = 22;
		int startDay = 4;
		int startMonth = 7;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);
		assertTrue(appt.getValid());
		assertEquals(21, appt.getStartHour());
		assertEquals(22, appt.getStartMinute());
		assertEquals(4, appt.getStartDay());
		assertEquals(7, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Dog's funeral", appt.getTitle());
		assertEquals("Poor doggo!", appt.getDescription());
		//assertFalse(appt.getValid());
	}
	@Test
	public void test05()  throws Throwable  {
		String title = "Vegas party";
		String description = "Finally 22!";
		int startHour = 0;
		int startMin = 12;
		int startDay = 8;
		int startMonth = 4;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(0, appt.getStartHour());
		assertEquals(12, appt.getStartMinute());
		assertEquals(8, appt.getStartDay());
		assertEquals(4, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Vegas party", appt.getTitle());
		assertEquals("Finally 22!", appt.getDescription());
		//assertFalse(appt.getValid());
	}
	@Test
	public void test06()  throws Throwable  {
		String title = "Netflix binge watch";
		String description = "Cause why not!";
		int startHour = 3;
		int startMin = 2;
		int startDay = 1;
		int startMonth = 1;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(3, appt.getStartHour());
		assertEquals(2, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(1, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Netflix binge watch", appt.getTitle());
		assertEquals("Cause why not!", appt.getDescription());
		//assertFalse(appt.getValid());
	}
	@Test
	public void test07()  throws Throwable  {
		String title = "Jet life";
		String description = "Finally own a jet!";
		int startHour = 11;
		int startMin = 39;
		int startDay = 21;
		int startMonth = 2;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(11, appt.getStartHour());
		assertEquals(39, appt.getStartMinute());
		assertEquals(21, appt.getStartDay());
		assertEquals(2, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Jet life", appt.getTitle());
		assertEquals("Finally own a jet!", appt.getDescription());
		//assertFalse(appt.getValid());
	}
	@Test
	public void test08()  throws Throwable  {
		String title = "Sippin on mud";
		String description = "Finally got that mud!";
		int startHour = 14;
		int startMin = 22;
		int startDay = 3;
		int startMonth = 8;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(14, appt.getStartHour());
		assertEquals(22, appt.getStartMinute());
		assertEquals(3, appt.getStartDay());
		assertEquals(8, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Sippin on mud", appt.getTitle());
		assertEquals("Finally got that mud!", appt.getDescription());
		//assertFalse(appt.getValid());
	}
	@Test
	public void test09()  throws Throwable  {
		String title = "NBA game";
		String description = "Finally got tickets!";
		int startHour = 20;
		int startMin = 20;
		int startDay = 20;
		int startMonth = 12;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(20, appt.getStartHour());
		assertEquals(20, appt.getStartMinute());
		assertEquals(20, appt.getStartDay());
		assertEquals(12, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("NBA game", appt.getTitle());
		assertEquals("Finally got tickets!", appt.getDescription());
		//assertFalse(appt.getValid());
	}
	@Test
	public void test10()  throws Throwable  {
		String title = null;
		String description = null;
		int startHour = 2;
		int startMin = 3;
		int startDay = 3;
		int startMonth = 3;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(2, appt.getStartHour());
		assertEquals(3, appt.getStartMinute());
		assertEquals(3, appt.getStartDay());
		assertEquals(3, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());
		//assertFalse(appt.getValid());
	}

	
}
