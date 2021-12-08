package pracGroup;

import java.util.Scanner;

public class If_else_loop_scanner_Grades {

	public static void main(String[] args) {
		
		//https://www.programiz.com/java-programming/if-else-statement
		
		// For example assigning grades (A, B, C) based on percentage obtained by a student.

		//if the percentage is above 90, assign grade A
		//if the percentage is above 75, assign grade B
		//if the percentage is above 65, assign grade C
		
		int math = 85;
		int science = 96;
		int reading = 90;
		int writing = 72;
		
		String m = "Your math average is " + math;
		System.out.println(m);
		
		String s = "Your science average is " + science;
		System.out.println(s);
		
		String r = "Your reading average is " + reading;
		System.out.println(r);
		
		String w = "Your writing average is " + writing;
		System.out.println(w);
		
		System.out.println();//1
		
	int [] myGrades = {math, science, reading, writing};
		
		for (int a:myGrades) {
			//System.out.println(a); //this will print the int grade.
			
		if (a >= 90) {
			System.out.println('A');
		}
		
		else if (a >=75) {
			System.out.println('B');
		}
		
		else if (a >=65) {
			System.out.println('C');
		}
		
		else {
			System.out.println('F');
		}
		}
		
		System.out.println();//2
							//I want to print the name of the course in front of the letter grade.
		
		System.out.println("Give me your numerical grade and I will return its letter grade.");
		
		Scanner grade = new Scanner(System.in);
		
		int myGrade = grade.nextInt(); //1
			
		if (myGrade >= 90) {
			System.out.println('A');
		}
		
		else if (myGrade >=75) {
			System.out.println('B');
		}
		
		else if (myGrade >=65) {
			System.out.println('C');
		}
		
		else {
			System.out.println('D');
		}
		
		myGrade = grade.nextInt();//2
		
		if (myGrade >= 90) {
			System.out.println('A');
		}
		
		else if (myGrade >=75) {
			System.out.println('B');
		}
		
		else if (myGrade >=65) {
			System.out.println('C');
		}
		
		else {
			System.out.println('D');
		}
		
		myGrade = grade.nextInt(); //3
		
		if (myGrade >= 90) {
			System.out.println('A');
		}
		
		else if (myGrade >=75) {
			System.out.println('B');
		}
		
		else if (myGrade >=65) {
			System.out.println('C');
		}
		
		else {
			System.out.println('D');
		}
		
		//I want to continue looping this so that I can enter many more grades without having 
		//to re-run the program after entering one grade without having to continuously copy 
		//and paste the conditions.
		}

	}



