package Control_Statement;

public class FOR_LOOP {

	public static void main(String[] args) {
		/* There are two types of for loops
		 * 1.Traditional For Loop
		 * 2.ForEach
		 * 
		 * 1.Traditional For Loop
		 * 	for(initialization;condition;iteration)
		 * 		{
		 * 			Body 
		 * 		}
		 */
		
		//Type 1: General Form
		for(int i=0;i<5;i++)
		{
			System.out.println("HI");
		}
		//Type 2: Using comma to include more than one statement
		for(int i=0, j=0;i<10;i++,j++)
		{
			System.out.println("i= "+i +" and j= " +j);
		}
		//Type 3: Using only for loop condition
		int i=0;
		boolean B= false;
		for(;!B;)
		{
			
			if(i==5) B=true;
			
			System.out.println("i = " +i);
			i=i+1;
		}
		//Type 4: for loop without initialization, condition and iteration
		// Also called infinite loop
		/*
		 * for(; ;)
		 * {
		 *   //body
		 * }
		 * 
		 * It leads to infinite loop so that's why statement is in comments
		 */

		
		/*
		 * A for-each style loop is designed to cycle through a collection of objects, such as an array, 
		 * in strictly sequential fashion, from start to finish. In Java, the for-each style of for is also referred to as the enhanced for loop.
		 * General Syntax:
		 * 		for(type itr-var : collection) statement-block
		 * 
		 */
		
		int a[]= {4,6,8,3,5};
		for(int x:a)
		{
			System.out.println("x = "+x);
		}
	}

}
//Author:Krishna
