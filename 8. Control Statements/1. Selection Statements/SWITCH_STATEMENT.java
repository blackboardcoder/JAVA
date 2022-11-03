package Control_Statement;

public class SWITCH_STATEMENT {

	public static void main(String[] args) {
		/*
		 * The switch statement is Java’s multiway branch statement. 
		 * It provides an easy way to dispatch execution to different parts of your code based on the value of
		 *  an expression.
		 */
		
		int month = 3;
		switch(month)
		{
		case 1: System.out.println("January");
		break;
		case 2: System.out.println("February");
		break;
		case 3: System.out.println("March");
		break;
		case 4: System.out.println("April");
		break;
		case 5: System.out.println("May");
		break;
		default: System.out.println("Error");
		break;
		}

	}

}
