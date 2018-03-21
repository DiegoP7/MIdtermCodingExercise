package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester {
	
	public UUID SemesterID;
	public Date StartDate;
	public Date EndDate;
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
}