package com.cg.inheritance;

public class InheritanceDemoMain {
	// By using inheritance, we can reuse the code from the InheritanceDemoCitizen class and 
	// avoid rewriting code in the InheritanceDemoStudent class. 
	// This makes the code more organized and easier to maintain. 
	// InheritanceDemoStudent object as a InheritanceDemoCitizen object.
	// Plus we can have additional properties and methods in InheritanceDemoStudent as well.

	public static void main(String[] args) {
		InheritanceDemoStudent sOne=new InheritanceDemoStudent("Sandeep Dey", "98239813409283", "Bruh Colony", 23, "AOT", 76);
		sOne.introduction();
		InheritanceDemoStudent sTwo=new InheritanceDemoStudent("Bruce Wayne", "xxxxxxxxxxx700", "Bruh Colony", 00, "AOT", 77);
		sTwo.introduction();
		InheritanceDemoStudent sThree=new InheritanceDemoStudent("Teen Titan", "12312312312312", "Bruh Colony", 17, "AOT", 78);
		sThree.introduction();

	}
	// Output:
//	-------------------------------------
//	I am Sandeep Dey and my age is 23
//	I am a Citizen, my aadhaar number is 98239813409283 and address is Bruh Colony
//	I am also a student from AOT, my roll number is 76
//	-------------------------------------
//	Sandeep Dey is Eligible to vote
//	-------------------------------------
//	-------------------------------------
//	I am Bruce Wayne and my age is 0
//	I am a Citizen, my aadhaar number is xxxxxxxxxxx700 and address is Bruh Colony
//	I am also a student from AOT, my roll number is 77
//	-------------------------------------
//	By virtue of Citizen fan base, Bruce Wayne is Eligible for everything, including vote
//	-------------------------------------
//	-------------------------------------
//	I am Teen Titan and my age is 17
//	I am a Citizen, my aadhaar number is 12312312312312 and address is Bruh Colony
//	I am also a student from AOT, my roll number is 78
//	-------------------------------------
//	Teen Titan is Not Eligible to vote
//	-------------------------------------

}
