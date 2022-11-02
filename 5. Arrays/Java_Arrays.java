package Arrays;

public class Java_Arrays {

	/*
	 * An array is a group of like-typed variables that are referred to by a common name. 
	 * Arrays of any type can be created and may have one or more dimensions.
	 */
	public static void main(String[] args) {
		int OD[] = new int[5]; //One Dimensional Array Declaration with size of 5
		System.out.println("One Dimensional Array");
		OD[0]=20;
		OD[1]=30;
		OD[2]=40;
		OD[3]=50;
		OD[4]=60;
		for(int i=0;i<5;i++)
		{
			System.out.println(OD[i]);
		}
		
		int AI[] = {1,2,3,4}; //Array Initializer and Size also Decalared at the same time. There's no need to use new keyword also
		
		int MD[][]= new int[2][2];
		MD[0][0]=30;
		MD[0][1]=33;
		MD[1][0]=77;
		MD[1][1]=98;
		System.out.println("Two Dimensional Array");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" " +MD[i][j]);
			}
			System.out.println("");
		}
		
	}

}

//Author: Krishna