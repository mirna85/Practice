package practice;

public class stringBuffer_and_Builder {

	public static void main(String[] args) {
	
	String word = "mimrnraa";
	System.out.println(word);
		
	StringBuilder sb = new StringBuilder();
	for(int i=0; i<word.length(); i++) {
		char eachChar = word.charAt(i);
		int index = word.indexOf(eachChar, i+1);
		if(index==-1) {
			sb.append(eachChar);
		}
	}
	
	System.out.println(sb);
		
	}

}
