package org.cts.test;

//Raj - 8124295906
public class StudentDetails {
	
	//ctrl+space - method generate 
	private void studentName() {
		//ctrl+d - to remove the line
		System.out.println("Student name is Siddharthan");

	}
	
	private void studentLocation() {
		System.out.println("My location is Pallavaram");
	}
	
	private void studentLearningMode() {
		System.out.println("My learning mode is direct");
	}

	public static void main(String[] args) {
		
		//classname objectname =new classname();
		
		StudentDetails s = new StudentDetails();
		
		//objectname.methodname
		s.studentName();
		s.studentLocation();
		s.studentLearningMode();
		
	}
	
}
