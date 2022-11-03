package Control_Statement;

public class JUMP_STATEMENT {

	public static void main(String[] args) {
		/*
		 * Java supports three jump statements: break, continue, and return. 
		 * These statements transfer control to another part of your program.
		 * 
		 */

		//Break: used to exit the loop
		for(int i=0;i<10;i++)
		{
			System.out.println("i = " +i);
			if(i==6) break;
		}
		
		//Labeled Break
		for(int i=0;i<5;i++)
		{
			Label:{
				if(i==3) break Label;
				System.out.println("LABELED BREAK" +i);
			}	
		}
		
		//Continue:A continue statement ends the current iteration of a loop.
		for(int i=0;i<5;i++)
		{
			if(i==2) continue;
			System.out.println("Continue" +i);
		}
		
		//Labeled Continue
		Label: for(int i=0;i<5;i++)
		{
			 for(int j=0;j<1;j++){
				System.out.println("Continue Label " +i);
			}
			if(i==2) continue Label;
		}
		
		/*return : The return statement is used to explicitly return from a method.
		 *  That is, it causes program control to transfer back to the caller of the method.
		 */
		//return
		if (2==2) return;
	}

}

//Author:Krishna
