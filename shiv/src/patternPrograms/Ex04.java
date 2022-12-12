package patternPrograms;

public class Ex04 {

	public static void main(String[] args) {

	//******
	// *****
	//  ****
	//   ***
	//    **
	//     *
		
		//rows=6,column/star=6,space=0
		int star=6;
		int space=0;
		//outer for loop--rows
		for(int i=1;i<=6;i++)
		{
			//for loop for space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
					
		    //for loop for star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			space++;
			star--;
			System.out.println();
		}
		
		
		
		
	}

}
