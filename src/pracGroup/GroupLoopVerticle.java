package pracGroup;

public class GroupLoopVerticle {
	
	public static void main(String[]args) {
		
		String verticle = "Hello";
		char[] a=verticle.toCharArray();
		for(char v:a) 
			System.out.println(v); //(1)
	
			System.out.println();
			
			String vertical = "World";
			char [] vd = vertical.toCharArray();
			int size = vertical.length();
			for(int i=0; i<=size-1; i++){
			System.out.println(vd[i]); //(2)
		}


	}
}
