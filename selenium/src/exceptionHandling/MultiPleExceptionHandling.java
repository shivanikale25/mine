package exceptionHandling;

public class MultiPleExceptionHandling {

	public static void main(String[] args)
	{

		String a="abc";
		
		try {	
		   // System.out.println(a.charAt(10));
			System.out.println(10/0);
		} 
		catch (StringIndexOutOfBoundsException e) {
         System.out.println(e);
		}
		
		
		catch (ArithmeticException f) {
	         System.out.println(f);

			
		}
		
		
		
	}

}
