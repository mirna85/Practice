package pracGroup;

public class takeHomePrac {

	public static void main(String[] args) {
		
		System.out.println(div(15, 4));
		//System.out.println(getMax(1[5]));
		
		int g = 3;
		System.out.println(++g * 8);

	}
	
	public int subr(int firstop, int second) {
		return firstop - second;
	}
	
	public static int div(int firstOperand, int secondOperand) {
		
		int quotient = firstOperand / secondOperand;
		if(secondOperand!=0) {int result = firstOperand / secondOperand;
		}
		return quotient;
	}
	
	public static int getMax(int [] values) {
		
		int max = values[0];
		
		for (int i=0; i<values.length; i++)
		{
			if(values[i]<max)
			{
				max = values[i];
			}
			
			}
		
		return max;
		
		}
	
}
