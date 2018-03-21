package com.cisc181.core;

import java.util.UUID;

public class Course {
	
	public UUID CourseID;
	public String CourseName;
	public int GradePoints;
	
	public Course(UUID CourseID, String CourseName, int GradePoints) {
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
	}
	
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	
	public String CourseName() {
		return CourseName;
	}
	
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	
	public int GradePoints() {
		return GradePoints;
	}
	
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	
	public int getGradePoints() {
		return GradePoints;
	}
	
	

}
