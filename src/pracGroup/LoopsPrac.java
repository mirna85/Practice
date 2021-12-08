package pracGroup;

public class LoopsPrac {
	
public static void main(String[] args) {
		
	//Loops with String: Print String J 20 times.
	//Arrays
	//ToCharArray identifies according to index location (sorts: alpha or numeric ascending)
	
	
	//Loops with Strings 
	
	String J = "Learning Java";
	
	for(int i=0; i<=20; i++) {//="i<20"		System.out.println(i+1 + " " + J);
	}

	System.out.println();
	
	for(int i=0; i<=20; i++) {//="i<20"
	System.out.println(i);
	}
	
	System.out.println();
	
	for(int i=20; i>0; i--) {//or "i>=1"
		System.out.println(i);
	}
	
	//Arrays:
	//Approach 1:
	
	String [] Group = {"Aa", "Bb", "Cc", "Dd"};
	
	System.out.println(Group[1]);
	System.out.println(Group.length);
	
	//I want the last name on the list
	
	int list = Group.length;

	System.out.println(Group[list-1]);
	
	System.out.println();
	
	//Types of Arrays:
	
	int [] grades = {80, 60, 90};
	char [] letters = {'B', 'D', 'A', 'C'};
	String [] words = {"Hello", "Bye", "Hi"};
	
	System.out.println(grades[0]);
	System.out.println(letters[2]);
	System.out.println(words[1]);
	
	//Approach 2: We know how many
	
	String [] Group1 = new String [4]; 
	
	Group1 [0] = "Ee";
	Group1 [1] = "Ff";
	Group1 [2] = "Gg";
	Group1 [3] = "Hh";
	
	
	//To Char Array (next time)
	
	
	
	//System.out.println();
	
	//From Group?? (Not covered in class)
	
//String verticle = "Hello";
//char [] vd = verticle.toCharArray();
//int size = verticle.length();{
//}

//for(int i=0; i<size; i++){

//System.out.println(vd[i]); 
	
//}

//System.out.println();

//for(int i=0; i<=size-1; i++){
	//System.out.println(i+1 + " " +vd[i]); 	
//}
	
	//Wednesday March 24 with Arshpreet.
	//String T = "Today is Wednesday.";
	//char [] W = T.toCharArray();
	//int length = T.length();
	
	//System.out.println(length);
	
	//System.out.println();
	
	//for(int i=0; i<length-1; i++){
		//System.out.println(W[i]);
		//System.out.println(i + " " +T);
	//}
	
//	System.out.println(W[1]);//o
//	System.out.println(W[5]);//space
//	
//	System.out.println();

	
	//Loops with String Array ??
	//Loops with ToChar (Not covered in class yet)
	
	System.out.println();//Review
	
	for (int i=10; i>=0; i--) {
		
		System.out.println(i);//10-0
	}
	
	System.out.println("Hello");
	
	System.out.println();
	
	for (int i=0; i<=10; i++) {
		System.out.println(i);
		//break; if break is here, it will only print zero
	}
	
	}

}
