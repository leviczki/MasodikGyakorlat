
public class LeibnizPi {
	public static void main(String[] args) {
		
		double i = 1;
		double number = 1;
		boolean minusz = true;
		
		for(i=1; i <= 20000; i+=2) // rossz az eredmény ha 10 000-et írok, mert az i 2-vel nő és akkor ameddig fut at olyan, mintha 5 000 lenne
		{			
			if(minusz)
			{
				number = number - (1/(i+2));
				minusz = false;
				
			}
			else 
			{
				number = number + (1/(i+2));
				minusz = true;
			}
		}
		
		System.out.println(i);
		System.out.println(number);
		System.out.println(number*4);
		
		double pi = 0;
		double divider = 1;
		for(i = 0; i < 10000; i++)
		{
			double valami = 1/divider;
			if((i%2)==0)
			{
				pi += valami;
			}
			else {
				pi -= valami;
			}
			divider += 2;
		}
		
		System.out.println(i);
		System.out.println(pi);
		System.out.println(pi*4);
	}
}
