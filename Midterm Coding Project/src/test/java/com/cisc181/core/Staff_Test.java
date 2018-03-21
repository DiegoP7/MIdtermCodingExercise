package com.cisc181.core;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> Staff = new ArrayList<Staff>();

	public static Date setDate(int month, int day, int year) {
		
		Calendar calendar1 = Calendar.getInstance();
		
		calendar1.set(year, month, day);
		
		return calendar1.getTime();
	}
 
	@BeforeClass
	public static void setup() throws PersonException {
		
		Staff.add(new Staff("SpongeBob", "SpicyBoi", "SquarePants", setDate(7, 7, 1995), "Pineapple Circle", "(302)-111-1111","BestFryCook@live.com", " 8:00-10:00am", 1, 500, setDate(8, 5, 2013), eTitle.MR));
		Staff.add(new Staff("Polly", "Pom", "TheDog", setDate(6, 24, 2012), "DogTreat Road", "(302)-123-4567","PollyPomeran@gmail.com", " 1:00-4:00pm", 1, 25000, setDate(11, 2, 20116), eTitle.MS));
		Staff.add(new Staff("Diego", "Abacaxi", "Pinata", setDate(10, 5, 1997), "Doodlebob Drive", "(777)-912-8142","HitMe@yahoo.com", " 8:00-11:00am", 1, 53000, setDate(1, 1, 2011), eTitle.MR));
		Staff.add(new Staff("Lorry", "NoName", "Chang", setDate(5, 24, 1993), "Lazy Drive", "(610)-971-2395","Dory@live.com", " 9:00-10:00am", 1, 37000, setDate(6, 6, 2006), eTitle.MS));
		Staff.add(new Staff("Rodeo", "TheRabbit", "Li", setDate(12, 21, 199), "Lonely Lane", "(459)-214-1984","Rohdeohh@gmail.com", " 7:00-11:00am", 1, 18000, setDate(1, 2, 2003), eTitle.MR));
	}
	@Test
	public void testStaffSalary() throws PersonException {
		
		double sum = 0;
		
		for (Staff avg : Staff) {
			sum += avg.getSalary();
		}
		
		double average = sum / Staff.size();
		
		assertEquals(average, 26700, .01);
	}

	@Test(expected = PersonException.class) //Testing for invalid DOB
	public void testDOBException() throws PersonException {

		new Staff("Kawhi", "DPOY", "Leonard", setDate(7, 4, 1776), "Spurs Lane", "(710)-962-1274","RocketWrecker@gmail.com", " 6:00-10:00am", 1, 69000, setDate(1999, 12, 23), eTitle.MR);
	}
	
	@Test(expected = PersonException.class) //Testing for invalid phone number formatting
	public void testPhoneNumberException() throws PersonException {
		new Staff("Squidward", "ClarinetBoi", "Tortellini", setDate(4, 9,1995), "IsleOfMan Street", "8328568391","Squidwart@live.com", " 2:00-7:00pm", 2, 9000, setDate(2002, 7, 5), eTitle.MR);
	}
	
}