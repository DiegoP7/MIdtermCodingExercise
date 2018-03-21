package com.cisc181.core;
import java.util.UUID;

public class Enrollment
{
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
		EnrollmentID = UUID.randomUUID();
	}

	public double getGrade() {
		return Grade;
	}
	
	public void setGrade(double grade) {
		Grade = grade;
	}
}

