package practice;

import java.util.Scanner;

public class interviewTasks {

	public static void main(String[] args) {

		// Palindrome

//		System.out.println("Enter a word: ");
//
//		Scanner userInput = new Scanner(System.in);
//		String word = userInput.nextLine();
//		String reverse = "";
//		
//		char[] rev = word.toCharArray();
//
//		for (int i = rev.length - 1; i >= 0; i--) {
//			reverse = reverse + rev[i];
//		}
//
//		if (word.equalsIgnoreCase(reverse)) {
//			System.out.println("Palindrome");
//		}
//
//		else {
//			System.out.println("Not a palindrome");
//		}
//		
//		System.out.println("Enter another: ");
//		
//		String word2 = userInput.nextLine();
//		
//		char[] rev2 = word.toCharArray();
//		String reverse2 = "";
//
//		for (int i = rev2.length - 1; i >= 0; i--) {
//			reverse2 = reverse2 + rev2[i];
//		}
//
//		if (word2.equalsIgnoreCase(reverse2)) {
//			System.out.println("Palindrome");
//		}
//
//		else {
//			System.out.println("Not a palindrome");
//		}

		// Odd/Even

//		System.out.println("Enter a number: ");
//		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
//
//		if (num % 2 == 0){
//		System.out.println("Even");
//		}
//		else{
//		System.out.println("Odd");
//		}

		// Factorial of a given number

//		System.out.println("Enter a number to calculate its factorial: ");
//		Scanner input= new Scanner(System.in);
//		int num = input.nextInt();
		int num = 5;
		int factorialValue = 1;

//		if (num < 0) {
//			System.out.println("Enter a positive integer.");
//		} else {

			for (int i = 1; i <= num; i++) {
				factorialValue = factorialValue * i;
			}

			System.out.println("The factorial of " + num + " is " + factorialValue);
		}

		// Factorial of a given number #2

//		int n = 3;
//		int value = factorial(n);
//		System.out.println("The factorial of " + n + " is " + value);
//	}
//	
//	static int factorial(int num) {
//		
//		if (num==0) {
//			return 1;
//		}
//		else {
//			return(num*factorial(num-1));
//		}

	}
