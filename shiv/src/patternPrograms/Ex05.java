package patternPrograms;

public class Ex05 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		//******    
		
		
		int star=1;
		int space=5;
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		
		}
		
	}

}
