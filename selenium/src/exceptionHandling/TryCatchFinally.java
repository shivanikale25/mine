package exceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {

		
		
		String a= "abc";
		
		try {
				
		System.out.println(a.charAt(10));	
			
		} 
		catch (Exception e) {
			
			System.out.println(e);
		}
		
		finally {
			
		System.out.println("finally block is running");
		}
	}

}
