package Conversion_and_Casting;

public class Conversion_and_Casting {

	public static void main(String[] args) {
		/* Assign a value of one type to a variable of another type.
		 * If the two types are compatible, then Java will perform the conversion automatically.
		 * 
		 * Java’s Automatic Conversions
		 * When one type of data is assigned to another type of variable, an automatic type
		 * conversion will take place if the following two conditions are met:
		 *     • The two types are compatible.
		 *     • The destination type is larger than the source type.
		 */
		
		int I;
		float F = 134.45f;
		I = (int)F; // Type Casting
		System.out.println("B value after type casting: " +I);
		
		//Type Promotion
		byte a = 40;
		byte b = 50;
		byte c = 100;
		int d = a * b / c;
		System.out.println("Value of d: "+d);
		
		/*
		 * The Type Promotion Rules
		 * Java defines several type promotion rules that apply to expressions. They are as follows: 
		 * First, all byte, short, and char values are promoted to int, as just described.
		 * Then, if one operand is a long, the whole expression is promoted to long. 
		 * If one operand is a float, the entire expression is promoted to float.
		 * If any of the operands are double, the result is double
		 */
	}

}

//Author: Krishna
