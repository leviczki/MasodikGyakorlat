
public class IkerPrim {
	public static void main(String[] args) {
		//1-100 számpárok amelyek ikerprímek 8db lesz
		
		for(int i = 1; i<= 100; i++)
		{
			if(IsPrim(i))
			{
				int nextPrim = 0;
				for(int j = i+1; j<=100; j++)
				{
					if(IsPrim(j))
					{
						nextPrim = j;
						break;
					}
				}
				if(((nextPrim - i) == 2))
				{
					System.out.println(i+" "+nextPrim);
				}
			}
		}
	}
	
	public static boolean IsPrim(int number)
	{
		for(int i = 2; i < number; i++)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
