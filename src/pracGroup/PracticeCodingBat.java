package pracGroup;

public class PracticeCodingBat {

	public static void main(String[] args) {
	
		// Given a string, return a new string where "not " has been added to the front. However, 
		//if the string already begins with "not", return the string unchanged. 
		//Note: use .equals() to compare 2 strings. Have not learned notString yet.
		
		String a = "awake";
		String b = "not awake";
		String ab = "not " + a;
		
		System.out.println("not" + " " + a);//(1)
		System.out.println(b);//(2)
		
		System.out.println(b.equals(ab));//(3)
		
		System.out.println();
		
		//Given a string, return true if the string starts with "hi" and false otherwise.
		
		String c ="Hello everyone!";
		
		System.out.println(c.startsWith("hi")); //4
		
		System.out.println();
		
		//w3Schools
		
		// "+="?
		
		//Use the correct method to find the highest value of x and y.
//		int x = 5;
//		int y = 10;
//		Math."max"(x, y);
		
		//Use the correct method to find the square root of x.
//		int x = 16;
//		Math.sqrt(x);

		String y = "*********";
	    for(int i=0; i<10; i++){
	    System.out.println((i+1+" ")+y);
	    }
	    
	    System.out.println();
	    
	    //Given a string, return a new string made of 3 copies of the 
	    //last 2 chars of the original string. String length >= 2.
	    
	    String mc = "apple";

	    String result = mc.substring(mc.length()-3); //mc.length()-3 is the starting point.
	    
	    System.out.println(result+result+result);
	    
	    System.out.println(result.concat(result).concat(result));
	    
	    System.out.println(mc.substring(3));
	    
	    System.out.println();
	    
	    //Given a string, return true if it ends in "ly".
	    
	    String aa= "endlessly";
	    String bb= "ly";
	    System.out.println(aa.endsWith(bb));
	    
	}

}
