
public class Fakt {
	
	public static void main(String[] args) {
		
		System.out.println(faktorialis(10));
	}
	
	public static long faktorialis(int input)
	{
		long multiplication=1;//szorzat
		//multiplier szórzó
		for(int multiplier=1; multiplier <= input; multiplier++)
		{
			multiplication *= multiplier; 
		}
		
		return multiplication;
	}
}
