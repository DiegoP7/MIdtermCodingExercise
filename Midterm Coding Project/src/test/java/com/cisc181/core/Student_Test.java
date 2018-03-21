package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.UUID;
import java.util.Arrays;
import java.util.Date;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	static ArrayList<Student> Students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	static ArrayList<Enrollment> CISC106 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CISC181 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CHEM103 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> BUSI101 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> BUSI160 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CHEM104 = new ArrayList<Enrollment>();


	public static Date newDate(int yr, int mon, int day) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(yr, mon, day);
		
		return calendar.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {
		
		Course CISC = new Course(UUID.randomUUID(), "CISC", 100);
		
		Course BUSI = new Course(UUID.randomUUID(), "BUSI", 100);
		
		Course CHEM = new Course(UUID.randomUUID(), "CHEM", 100);

		courses.add(CISC);
		courses.add(CHEM);
		courses.add(BUSI);

		Semester Fall17 = new Semester(UUID.randomUUID(), newDate(2017, 8, 25), newDate(2017, 12, 15));
		
		Semester Spring18 = new Semester(UUID.randomUUID(), newDate(2018, 2, 5), newDate(2018, 5, 22));

		semesters.add(Fall17);
		semesters.add(Spring18);

		Section FallCISC106 = new Section(CISC.getCourseID(), Fall17.getSemesterID(), UUID.randomUUID(), 320);
		Section FallBUSI101 = new Section(BUSI.getCourseID(), Fall17.getSemesterID(), UUID.randomUUID(), 234);
		Section FallCHEM103 = new Section(CHEM.getCourseID(), Fall17.getSemesterID(), UUID.randomUUID(), 212);
		Section SpringCISC181 = new Section(CISC.getCourseID(), Spring18.getSemesterID(), UUID.randomUUID(), 110);
		Section SpringBUSI160 = new Section(BUSI.getCourseID(), Spring18.getSemesterID(), UUID.randomUUID(), 304);
		Section SpringCHEM104 = new Section(CHEM.getCourseID(), Spring18.getSemesterID(), UUID.randomUUID(), 010);

		sections.add(FallCISC106);
		sections.add(FallBUSI101);
		sections.add(FallCHEM103);
		sections.add(SpringCISC181);
		sections.add(SpringBUSI160);
		sections.add(SpringCHEM104);
		

		Student Student1 = new Student("Bill", "A", "Phillips", newDate(1999, 6, 24), eMajor.COMPSI, "CISC",
				"(302)-912-9148", "BillP@gmail.com");

		Student Student2 = new Student("Hurry","Spring","Break", newDate(1997, 11, 11), eMajor.COMPSI,
				"CISC", "(914)-791-9814", "EBC@live.com");

		Student Student3 = new Student("Bugs","C","Bunny", newDate(1965, 9, 27), eMajor.CHEM,
				"CHEM", "(917)-271-7912", "Buggy@gmail.com");
		
		Student Student4 = new Student("Hello","Little","World", newDate(1999, 2, 29), eMajor.BUSINESS, "BUSINESS",
				"(302)-924-1492", "Hello@gmail.com");
		
		Student Student5 = new Student("Turtles", "Beat", "Hares", newDate(1998, 11, 9), eMajor.COMPSI,
				"CISC", "(124)-214-9871","Turtle@gmail.com");
		
		Student Student6 = new Student("Pig", "Outta", "Hay", newDate(1984, 1, 1), eMajor.CHEM,
				"CHEM", "(912)-914-8124", "DumbBoi@gmail.com");
		
		Student Student7 = new Student("Pig","Outta","Sticks", newDate(1984, 1, 2), eMajor.CHEM, "CHEM",
				"(981)-971-9174", "BackupPig@gmail.com");
		
		Student Student8 = new Student("Pig","Outta","Brick", newDate(1984, 1, 3), eMajor.BUSINESS, "BUSINESS",
				"(917)-142-1982", "SmartPig@gmail.com");
		
		Student Student9 = new Student("Big","Bad","Wolf", newDate(1997, 8, 12), eMajor.COMPSI,
				"CISC", "(123)-555-5555", "GonnaEatYerNan@gmail.com");
		
		Student Student10 = new Student("Alice","In","Wonderland", newDate(2000, 2, 21), eMajor.CHEM, "CHEM",
				"(912)-124-5687", "AliceLost@gmail.com");
		
		Students.add(Student1);
		Students.add(Student2);
		Students.add(Student3);
		Students.add(Student4);
		Students.add(Student5);
		Students.add(Student6);
		Students.add(Student7);
		Students.add(Student8);
		Students.add(Student9);
		Students.add(Student10);
		
		ArrayList<Integer> Grades1 = new ArrayList<Integer>(Arrays.asList(91, 88, 66));
		
		ArrayList<Integer> Grades2 = new ArrayList<Integer>(Arrays.asList(87, 79, 50));
		
		ArrayList<Integer> Grades3 = new ArrayList<Integer>(Arrays.asList(99, 88, 87));
		
		
		for (int i = 0; i < Students.size(); i++) {
			
			CISC106.add(new Enrollment(sections.get(0).getSectionID(), Students.get(i).getStudentID()));
			CISC106.get(i).setGrade(Grades1.get(i));
			
			CISC181.add(new Enrollment(sections.get(1).getSectionID(), Students.get(i).getStudentID()));
			CISC181.get(i).setGrade(Grades2.get(i));
			
			CHEM103.add(new Enrollment(sections.get(2).getSectionID(), Students.get(i).getStudentID()));
			CHEM103.get(i).setGrade(Grades3.get(i));
			
			BUSI101.add(new Enrollment(sections.get(3).getSectionID(), Students.get(i).getStudentID()));
			BUSI101.get(i).setGrade(Grades1.get(i));
			
			BUSI160.add(new Enrollment(sections.get(4).getSectionID(), Students.get(i).getStudentID()));
			BUSI160.get(i).setGrade(Grades2.get(i));
			
			CHEM104.add(new Enrollment(sections.get(5).getSectionID(), Students.get(i).getStudentID()));
			CHEM104.get(i).setGrade(Grades3.get(i));
		}
	}
	public double CalcStudentGPA(ArrayList<Enrollment> CISC106, ArrayList<Enrollment> CISC181, ArrayList<Enrollment> CHEM103,
			ArrayList<Enrollment> BUSI101, ArrayList<Enrollment> BUSI160, ArrayList<Enrollment> CHEM104, int Student) {
		
		final int TotalCourses = 6;
		
		double AvgGrdPts = 0;
		if ((CISC106.get(Student).getGrade() + CISC181.get(Student).getGrade() + BUSI101.get(Student).getGrade()
				+ CHEM103.get(Student).getGrade() + BUSI160.get(Student).getGrade() + CHEM104.get(Student).getGrade())
				/ TotalCourses >= 95) {
			AvgGrdPts = 4.0;
			
		} else if ((CISC106.get(Student).getGrade() + CISC181.get(Student).getGrade() + BUSI101.get(Student).getGrade()
				+ CHEM103.get(Student).getGrade() + BUSI160.get(Student).getGrade() + CHEM104.get(Student).getGrade())
				/ TotalCourses >= 90) {
			AvgGrdPts = 3.6;
			
		} else if ((CISC106.get(Student).getGrade() + CISC181.get(Student).getGrade() + BUSI101.get(Student).getGrade()
				+ CHEM103.get(Student).getGrade() + BUSI160.get(Student).getGrade() + CHEM104.get(Student).getGrade())
				/ TotalCourses >= 87) {
			AvgGrdPts = 3.30;
			
		} else if ((CISC106.get(Student).getGrade() + CISC181.get(Student).getGrade() + BUSI101.get(Student).getGrade()
				+ CHEM103.get(Student).getGrade() + BUSI160.get(Student).getGrade() + CHEM104.get(Student).getGrade())
				/ TotalCourses >= 80) {
			AvgGrdPts = 3.00;
			
		} else if ((CISC106.get(Student).getGrade() + CISC181.get(Student).getGrade() + BUSI101.get(Student).getGrade()
				+ CHEM103.get(Student).getGrade() + BUSI160.get(Student).getGrade() + CHEM104.get(Student).getGrade())
				/ TotalCourses >= 77) {
			AvgGrdPts = 2.30;
			
		} else if ((CISC106.get(Student).getGrade() + CISC181.get(Student).getGrade() + BUSI101.get(Student).getGrade()
				+ CHEM103.get(Student).getGrade() + BUSI160.get(Student).getGrade() + CHEM104.get(Student).getGrade())
				/ TotalCourses >= 69) {
			AvgGrdPts = 2.00;
			
		} else if ((CISC106.get(Student).getGrade() + CISC181.get(Student).getGrade() + BUSI101.get(Student).getGrade()
				+ CHEM103.get(Student).getGrade() + BUSI160.get(Student).getGrade() + CHEM104.get(Student).getGrade())
				/ TotalCourses >= 64) {
			AvgGrdPts = 1.60;
			
		} else if ((CISC106.get(Student).getGrade() + CISC181.get(Student).getGrade() + BUSI101.get(Student).getGrade()
				+ CHEM103.get(Student).getGrade() + BUSI160.get(Student).getGrade() + CHEM104.get(Student).getGrade())
				/ TotalCourses >= 60) {
			AvgGrdPts = 1.00;
			
		} else {
			AvgGrdPts = 0.00;
		}
		
		return AvgGrdPts;
	}
	@Test
	public void StudentGPATest() {
		
		assertEquals(1.0, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 0), .001);
		assertEquals(1.5, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 1), .001);
		assertEquals(2.0, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 2), .001);
		assertEquals(2.3, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 3), .001);
		assertEquals(3.6, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 4), .001);
		assertEquals(4.0, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 5), .001);
		assertEquals(1.6, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 6), .001);
		assertEquals(0.0, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 7), .001);
		assertEquals(3.6, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 8), .001);
		assertEquals(3.3, CalcStudentGPA(CISC106, CISC181, CHEM103, BUSI101, BUSI160, CHEM104, 9), .001);
	}
	public static double GradeTest(ArrayList<Enrollment> courses) {
		
		double AvgGr = 0;
		
		double avg = 0;
		
		
		for (int i = 0; i < Students.size(); i++) {
			
			avg += courses.get(i).getGrade();
			
			AvgGr = (avg / Students.size());
		}
		
		return AvgGr;
	}
	@Test
	public void GradeTesting() {
		
		assertEquals(69, GradeTest(CISC181), .01);
		assertEquals(72, GradeTest(CISC181), 01);
		assertEquals(80.5, GradeTest(CHEM103), .01);
		assertEquals(85.7, GradeTest(BUSI101), .01);
		assertEquals(92, GradeTest(BUSI160), 01);
		assertEquals(99.3, GradeTest(CHEM104), .01);
	}
	
	
}