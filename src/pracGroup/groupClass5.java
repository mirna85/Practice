package pracGroup;

public class groupClass5 {

	public static void main(String[] args) {
		
		// Continue and break (loops)
		
//		System.out.println("before");
//		
//		for(int i=1; i<=10; i++) {
//			if(i<2) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
//		System.out.println("after");

		//If/Else
//		
//		String A = "Green Apples";
//		String B = "Red Apples";
//				
//		if(A.equalsIgnoreCase("Green Apples")) {
//		System.out.println("Buy");
//		}
//		else if(A.equalsIgnoreCase("Red Apples")) {
//			System.out.println("Buy red");
//		}
//		else if(A.equalsIgnoreCase("Golden Apples")) {
//			System.out.println("Buy golden");
//		}
//		else {
//			System.out.println("Don't buy");
//		}
		
		int m = 9;
		while(m<10) {
			System.out.println(m);
			break;
		}
		
		char a = 'A';
		do {
			System.out.println("a");
		}
		while (a=='B');//false situations will print it once, true will print continously.
		
	}

}
