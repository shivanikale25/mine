package loopexample;

public class ForLoop {

	public static void main(String[] args)
	
	{
//print a to z
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
		}
		System.out.println("=====================================");
		
		for(char j='Z';j>='A';j--)
		{
			System.out.println(j);
		}
		System.out.println("=====================================");
        
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

}
