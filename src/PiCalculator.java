
public class PiCalculator {
	
	public static void main(String[] args) {
			
			double szorzat = 1;
			//double pi = 3.1415926535;
			//double halfpi = pi/2;
			double i = 2;
			int count = 0;
			
			for( ; i <= 10000; i+=2)
			{
				szorzat = szorzat * (i/(i-1));
				szorzat = szorzat * (i/(i+1));
				count++;
			}
			
			System.out.println(szorzat);
			System.out.println(szorzat*2);
			System.out.println(i);
			System.out.println(count);
			
	}
}
