package com.cisc181.core;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import com.cisc181.core.Person;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PersonException extends Exception {
	private Person person;
	//SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
	//Date date1 = new Date();
	
	Calendar calendar = Calendar.getInstance();
	calendar.add(Calendar.YEAR, -100);
	Date date1 = calendar.getTime();
	Date date2 = getDOB();
	

	public PersonException(Person person ) {
		this.person = person;
	}
	
	public PersonException(String Message) {
		super(Message);
	}
	
	try {
		if(date2.before(date1)) {
			throw new PersonException(person);
		}
	catch(PersonException ex) {
		
	}
	
	try {
		result = getPhone();
		private String regex = "(###)-###-####";
		private Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(result);
		if (m.matches()) {
			
				throw new PersonException(person);
		}
	catch(PersonException ex) {
		
	}
	
	}
	
	}
}
